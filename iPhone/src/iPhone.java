import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class iPhone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
// Implementação de AparelhoTelefonico
@Override
public void fazerLigacao() { System.out.println("Fazendo ligação..."); }

@Override
public void escolherVoicemail() { System.out.println("Escolhendo Voicemail..."); }

@Override
public void atenderLigacao() { System.out.println("Atendendo ligação..."); }

@Override
public void recusarChamada() { System.out.println("Recusando chamada..."); }

@Override
public void visualizarCalendario() { System.out.println("Visualizando calendário..."); }

@Override
public void abrirGaleriaFotos() { System.out.println("Abrindo galeria de fotos..."); }

@Override
public void visualizarContato() { System.out.println("Visualizando contato..."); }

@Override
public void criarConferencia() { System.out.println("Criando conferência..."); }

@Override
public void privarChamada() { System.out.println("Privando chamada..."); }

@Override
public void adicionarFavorito() { System.out.println("Adicionando favorito..."); }

@Override
public void listarFavorito() { System.out.println("Listando favoritos..."); }

@Override
public void listarChamadasRecentes() { System.out.println("Listando chamadas recentes..."); }

@Override
public void ouvirVoiceMail() { System.out.println("Ouvindo VoiceMail..."); }

@Override
public void visualizarConversa() { System.out.println("Visualizando conversa..."); }

@Override
public void mandarMensagem() { System.out.println("Mandando mensagem..."); }

@Override
public void digitarTeclado() { System.out.println("Digitando no teclado..."); }

@Override
public void listarFotos() { System.out.println("Listando fotos..."); }

@Override
public void aumentarFoto() { System.out.println("Aumentando foto..."); }

@Override
public void diminuirFoto() { System.out.println("Diminuindo foto..."); }

@Override
public void tornarWallpaper() { System.out.println("Definindo como wallpaper..."); }

// Implementação de ReprodutorMusical
@Override
public void selecionarMusico() { System.out.println("Selecionando músico..."); }

@Override
public void tocarMusica() { System.out.println("Tocando música..."); }

@Override
public void avaliarAlbum() { System.out.println("Avaliando álbum..."); }

@Override
public void pausarMusica() { System.out.println("Pausando música..."); }

@Override
public void reproduzirVideo() { System.out.println("Reproduzindo vídeo..."); }

@Override
public void listarVideos() { System.out.println("Listando vídeos..."); }

@Override
public void alternarTela() { System.out.println("Alternando tela..."); }

// Implementação de NavegadorInternet
@Override
public void retornarMenu() { System.out.println("Retornando ao menu..."); }

@Override
public void fazerBusca() { System.out.println("Fazendo busca..."); }

@Override
public void adicionarWidget() { System.out.println("Adicionando widget..."); }

@Override
public void acessarEmail() { System.out.println("Acessando email..."); }

@Override
public void notificarEmail() { System.out.println("Notificando novo email..."); }

@Override
public void mandarEmail() { System.out.println("Enviando email..."); }

@Override
public void lerEmail() { System.out.println("Lendo email..."); }

@Override
public void listarEmails() { System.out.println("Listando emails..."); }

@Override
public void splitView() { System.out.println("Ativando Split View..."); }

@Override
public void criarPasta() { System.out.println("Criando pasta..."); }

@Override
public void acessarSafari() { System.out.println("Acessando Safari..."); }

@Override
public void aumentarTela() { System.out.println("Aumentando tela..."); }

@Override
public void diminuirTela() { System.out.println("Diminuindo tela..."); }

@Override
public void adicionarNovaPagina() { System.out.println("Adicionando nova página..."); }

@Override
public void deletarPagina() { System.out.println("Deletando página..."); }

@Override
public void visualizarBolsa() { System.out.println("Visualizando Bolsa de Valores..."); }

@Override
public void visualizarTemperatura() { System.out.println("Visualizando temperatura..."); }

@Override
public void trocarCidade() { System.out.println("Trocando cidade..."); }

@Override
public void acessarMapa() { System.out.println("Acessando o mapa..."); }

@Override
public void procurarLocal() { System.out.println("Procurando local..."); }

@Override
public void visualizarPorSatelite() { System.out.println("Visualizando por satélite..."); }

}