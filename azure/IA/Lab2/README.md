
# Projeto de Pesquisa de Opiniões com IA e Azure

## Descrição do Projeto

Neste projeto, desenvolvi um sistema de busca em documentos utilizando a IA do Azure para analisar opiniões de clientes sobre uma rede nacional de cafés. O objetivo é capturar essas opiniões de várias partes do país, processá-las e analisá-las, fornecendo insights para a rede de cafés. Usamos a ferramenta AI Search para buscar e classificar esses dados.

### Situação do Problema

A empresa deseja saber as opiniões de seus clientes em todo o país. Para isso, buscamos implemenamos uma solução de IA para realizar buscas eficientes nas reviews dos clientes, que são armazenadas em um repositório na nuvem, utilizando recursos do Azure.

Após o processamento dos dados, as informações de opinião serão usadas para melhorar os serviços e produtos oferecidos pela rede de cafés.

## Tecnologias Utilizadas

- **Azure AI Search**: Utilizado para criar a ferramenta de busca em documentos.
- **Conta de Armazenamento Azure**: Utilizada para armazenar as reviews dos clientes em arquivos zipados.
- **Serviço de IA Azure**: Serviço para realizar a automação da busca nos documentos.
- **Automação**: Linkagem entre o serviço de IA e a conta de armazenamento do Azure para garantir a atualização contínua dos dados.

## Passos para Configuração

1. **Criação de Repositório no GitHub**:
   - Crie um repositório no GitHub com o nome de sua escolha.
   
2. **Configuração da Conta de Armazenamento no Azure**:
   - Crie uma conta de armazenamento no portal Azure.
   - Realize o upload de um arquivo zipado contendo as reviews para o experimento, utilizando a interface de armazenamento do Azure.

3. **Criação de AI Search**:
   - No portal Azure, crie um recurso de AI Search com o plano básico.
   - Defina as configurações do índice para que ele possa buscar eficientemente nos documentos de texto (reviews).
   
4. **Desenvolvimento de um Serviço de IA**:
   - Crie um serviço de IA que fará a busca nos documentos armazenados.
   - Configure o serviço para buscar constantemente os documentos na conta de armazenamento Azure e para atualizar os resultados em tempo real.
   
5. **Linkagem da Automação com a Conta de Armazenamento**:
   - Configure uma automação para realizar a busca contínua nos documentos da conta de armazenamento do Azure, garantindo que os resultados sejam atualizados e armazenados diretamente lá.



## Insights e Possibilidades

Durante a realização do projeto, alguns insights importantes foram obtidos:

- **Escalabilidade**: Utilizar a IA do Azure para buscar em grandes volumes de dados pode ser extremamente útil em projetos de pesquisa em larga escala.
- **AISearch**: Podemos usar a AISerach da azure para realizar buscas por diversos parâmetros incluindo palavraas chave, analise de snetimento, idioma entre outras; tudo isso dentro de documentos.
- **Automação**: A automação entre os serviços de IA e armazenamento torna o processo muito mais eficiente, permitindo atualizações em tempo real.
- **Armazenamento na Nuvem**: Usar o armazenamento do Azure para armazenar as reviews facilita o acesso e processamento, além de garantir que os dados sejam mantidos seguros e acessíveis.

## Aprendizados

- Configuração e uso do AI Search para realizar buscas em documentos de texto.
- Integração de serviços no Azure (AI Search, Armazenamento e IA) para criar uma solução automatizada e escalável.
- Manipulação de arquivos zipados e automação de processos no Azure.
