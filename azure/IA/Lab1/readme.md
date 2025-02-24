# Análise de Sentimentos com Azure Language Cognitive Services

Este repositório documenta um experimento de **Análise de Sentimentos** utilizando a API de Linguagem de IA do Azure. O objetivo foi testar a capacidade do serviço de identificar corretamente sentimentos (positivo, neutro e negativo) em diferentes tipos de textos.

## 📂 Estrutura do Repositório

```
├── inputs/
│   ├── sentencas_teste.txt  # Documento contendo frases usadas no experimento
├── readme.md  # Documentação completa do experimento
```

## 🚀 Como o Experimento Foi Realizado

1. Usei diferentes conjuntos de frases representando sentimentos positivos, negativos e neutros.
2. As frases foram submetidas à API de **Azure Language Cognitive Services** para análise de sentimentos.
3. Os resultados foram registrados e analisados para entender como a IA interpreta diferentes padrões linguísticos.

## 📥 Inputs Utilizados

Usei um conjunto diversificado de textos para testar o modelo. Algumas amostras:

**Exemplo de Sentença Positiva:**

> “Hoje tive uma das melhores experiências de compra da minha vida! O atendimento foi excepcional, os funcionários foram extremamente atenciosos e me ajudaram a encontrar exatamente o que eu precisava. O produto é de altíssima qualidade e chegou antes do prazo esperado. Definitivamente recomendo essa loja para qualquer pessoa que busca um bom serviço!”

> “Estou extremamente satisfeito com minha nova assinatura de streaming! A plataforma é intuitiva, os conteúdos são variados e sempre encontro algo interessante para assistir. Além disso, a resolução dos vídeos é incrível e não tive problemas com travamentos ou lentidão. Valeu cada centavo!”

**Exemplo de Sentença Neutra:**
> “Fui ao novo restaurante da cidade para experimentar um prato diferente. O ambiente era agradável e o atendimento foi ok, mas nada excepcional. A comida estava boa, mas não surpreendeu. No geral, foi uma experiência normal, sem nada muito positivo ou negativo para destacar.”

> “Recebi meu pedido hoje. A embalagem veio intacta e o produto parece estar de acordo com a descrição do site. Ainda não testei completamente, mas até agora tudo parece normal. Se houver algum problema, entrarei em contato com o suporte.”

**Exemplo de Sentença Negativa:**
>  “Estou extremamente frustrado com esse serviço! Fiz uma compra há mais de duas semanas e até agora meu pedido não foi entregue. O suporte ao cliente simplesmente ignora minhas mensagens e quando finalmente respondem, não oferecem nenhuma solução útil. Definitivamente não recomendo!”

> “A experiência de usar esse aplicativo foi um desastre completo. Ele trava constantemente, consome muita bateria e é cheio de anúncios irritantes que aparecem o tempo todo. Eu esperava muito mais, especialmente porque paguei pela versão premium. Me arrependi completamente da compra.”

O arquivo **`inputs/sentencas_teste.txt`** contém todas as frases utilizadas.

## 📊 Resultados e Insights

Após o processamento das frases pela API de Análise de Sentimentos do Azure, observamos:

- Frases com **palavras extremamente positivas** foram corretamente classificadas como **positivas**.
- Frases com **linguagem negativa e expressões de insatisfação** foram bem detectadas como **negativas**.
- Algumas frases **neutras** ou **ambíguas** (com sentimentos mistos) tiveram pontuações distribuídas entre positivo e negativo, evidenciando o desafio da IA em classificar contextos subjetivos.

## 🛠 Possibilidades Futuras

Durante este experimento, percebemos que a **Análise de Sentimentos** pode ser aplicada em várias áreas, como:

- **Monitoramento de Redes Sociais:** Avaliação de opiniões sobre marcas e produtos.
- **Atendimento ao Cliente:** Identificação de clientes insatisfeitos em tickets de suporte.
- **Análise de Feedbacks:** Melhor compreensão de críticas e sugestões em pesquisas de satisfação.

## 📸 Prints do Processo

(Aqui você deve adicionar imagens demonstrando o processo e os resultados obtidos.)

## 🔗 Como Testar

Se quiser replicar este experimento, basta seguir os passos abaixo:

1. Criar uma conta no **Azure** (se ainda não tiver).
2. Ativar o **Language Cognitive Services**.
3. Criar um script que envie frases para a API e receba a análise de sentimentos.
4. Comparar os resultados e extrair insights!

---

Com esse experimento, exploramos as capacidades do **Azure Language Cognitive Services** e aprendemos como a IA interpreta diferentes expressões humanas. 

## Bootcamp
- Esse experimento foi desenvolvido como um desafio durante um bootcamp da DIO em parceria com o banco Bradesco.

