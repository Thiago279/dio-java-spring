package br.com.dio.ui.custom.input;

import br.com.dio.model.Square;
import br.com.dio.service.EventEnum;
import br.com.dio.service.EventListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;

import static br.com.dio.service.EventEnum.CLEAR_SPACE;
import static java.awt.Font.PLAIN;

public class NumberText  extends JTextField implements EventListener {
    private final Square square;

    public NumberText(final Square square){
        this.square = square;
        var dimension = new Dimension(50,50);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setVisible(true);
        this.setFont(new Font("Arial", PLAIN, 20));
        this.setHorizontalAlignment(CENTER);
        this.setDocument(new NumberTextLimit());
        this.setEnabled(!square.isFixed());
        if (square.isFixed()){
            this.setText(square.getActual().toString());
        }
        this.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changeSquare();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changeSquare();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changeSquare();
            }

            private void changeSquare(){
                if(getText().isEmpty()){
                    square.clearSquare();
                }
                square.setActual(Integer.parseInt(getText()));
            }
        });
    }

    @Override
    public void update(EventEnum eventType) {
        if (eventType.equals(CLEAR_SPACE) && (this.isEnabled())){
            this.setText("");
        }
    }
}
