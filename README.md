# 🏥 Totem de Senhas - Sistema Simples para Posto de Saúde

## Descrição

Este projeto em **Java com Swing** simula um sistema simples de totens para postos de saúde, onde o usuário escolhe o serviço desejado e recebe uma senha.

O sistema abre uma janela inicial para o usuário digitar o nome, depois apresenta opções de serviços (Dentista, Médico, Vacina, Encaixe). Ao escolher, mostra a senha e depois, após um tempo, chama o paciente para a sala com um botão para confirmar que está indo.

## Funcionalidades

- Tela inicial para o usuário digitar seu nome.  
- Tela de escolha do serviço desejado.  
- Tela que exibe a senha gerada e mensagem para aguardar.  
- Tela que chama o paciente para a sala com confirmação de "Indo".  
- Timer para abrir automaticamente a tela de chamada após 3 segundos, mantendo a tela de senha aberta.

## Tecnologias Utilizadas

- Linguagem: **Java**  
- Biblioteca gráfica: **Swing (javax.swing)**  
- Uso de **Timer** para controle de eventos temporizados.
