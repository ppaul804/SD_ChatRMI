# Sistema de Chat com Java RMI
### Objetivo:
Pretende-se com este trabalho desenvolver um sistema de chat (tipo [IRC](https://www.google.com/search?q=irc)) que, além de permitir o envio e recepção de mensagens entre os usuários conectados num grupo, permite também o envio e recepção de arquivos.
#### Sumário das funcionalidades:
* Usuário reconhecido pelo seu _nickname_
* Mensagens para todos (o normal)
* Mensagens privadas
* Transferência de arquivos (direta entre clientes)
* O servidor deve ter um mapeamento ip:porta -\> nick para todos os clientes como forma básica de garantir que ninguém envie uma mensagem por outro.
#### Tarefas dos clientes:
1. Conexão ao servidor. O programa tem de estar prevenido para a ocorrência de situações de erro, tais como não existir nenhum servidor ligado.
2. Envio do seu _nickname_ para o servidor e espera pela confirmação de aceitação ou não.
3. Se for aceite, começa a enviar mensagens para o servidor e recebe mensagens do servidor (de outros clientes). Sintaxe de envio das mensagens:

MSG: \<text\>
Enviar mensagem para todos (o normal).
O servidor substitui \<text\> por \<sndnick\>:\<text\> (onde sndnick é o
_nickname_ do emissor) e passa-a a todos os clientes.

PRIVATE: \<recnick\>:\<text\>
Enviar mensagem privada. O servidor substitui \<recnic\> por
\<sndnick\> e passa-a ao receptor.

4. Mudar de _nick_. O servidor deve responder com a mesma mensagem indicando aceitação, ou com NICKERR: \<razão\> indicando ocorrência de erro (nick já atribuído a outro cliente). Sintaxe de mudança de nick:

NICK: \<nickname\>

5. Envio de arquivos entre clientes. Para o cliente nick2 enviar um arquivo
ao cliente nick1, primeiro envia um SNDFILE. A transmissão de informação do
arquivo entre clientes, deve ter a intervenção do servidor.
6. Desligar o cliente.
#### Tarefas do servidor:
1. Processar conexões dos clientes (concorrentemente).
2. Reconhecimento de todas as mensagens recebidas dos clientes. Verificação de mensagens inválidas e resposta adequada.
3. Após receber um pedido do cliente, pedir o seu _nickname_ (internamente na programação), autenticá-lo, e enviar mensagem de aceitação ou não da conexão do cliente.
4. Atualização da sua lista de clientes ativos.
5. Se for aceite, recebe mensagens dos clientes, verifica se são mensagens para todos ou apenas para um deles, e envia a mensagem para o/os destino/os.
6. Mudar de _nick_. O servidor deve, se não houver nenhum cliente com aquele _nickname_, atualizar a sua base de dados com o novo _nick_. Note-se que em cada cliente, quando aparece uma mensagem de um outro cliente, deve ser indicado o _nick_ desse cliente.
7. Desligar o cliente. Servidor recebe mensagem de fim de conexão e atualiza a sua base de dados.