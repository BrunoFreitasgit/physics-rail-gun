# WIKI #

### Introdução ###

No seguinte repositório consta o desenvolvimento do trabalho prático a elaborar da disciplina de FSIAP (Física Aplicada). No contexto do segundo tema lecionado ao alunos, electricidade e magnetismo, o grupo decidiu programar uma aplicação que simula o disparo de um projétil através de uma railgun, um canhão electromagnético que recorre à electricidade e ao magnetismo para disparar objetos ao longo de segmentos metálicos.
Para tal recorremos a conteúdos, fórmulas e contantes relacionadas para utilizar no simulacro. A função base da aplicação é fornecer informação através da inserção de outra. Juntamente com o código do projeto será fornecido diferente material proveniente de um planeamento abordado na cadeira de ESOFT (Engenharia de Software) como um diagrama de classes, sequência, e um relatório onde constam os Casos de Uso, que descrevem as diferentes interações com a aplicação.

### Formulário ###

* F = m x a *(Força(N)= massa(Kg) x aceleração(m/s^2))* - 2º Lei de Newton, é importante para descrever a força aplicada a um projétil com determinada massa sobre determinada aceleração, variáveis permanentemente presentes e em constante alteração no simulacro.
___

* ![Fórmula.png](https://bitbucket.org/repo/qoBnBp/images/576317593-F%C3%B3rmula.png)   -  Lei de Biot-Savart. Fórmula para determinar a intensidade do Campo magnético gerado pela corrente elétrica que percorre os segmentos de metálicos. 
___

* ![Fórmula.png](https://bitbucket.org/repo/qoBnBp/images/395699314-F%C3%B3rmula.png) - Para determinar a força através da Intensidade dos Campo Elétrico, comprimentos dos trilhos e da intensidade do Campo Magnético.
___

* ![Fórmula_1.png](https://bitbucket.org/repo/qoBnBp/images/1115352075-F%C3%B3rmula_1.png)  - Fórmula para determinar a velocidade que será aplicada ao projétil.







### UC1: Criar Segmento ###

Neste UC serão criados os segmentos que vão compor a Railgun. A criação requer ao utilizador que forneca certos dados como a intensidade do campo elétrico gerada pela corrente presente nos trilhos, o raio e comprimento dos trilhos e a massa do projétil a disparar. Criado um segmento este é registado e são executadas as fórmulas cujos resultados irão fornecer a informação relativa à Railgun.


###UC2: Simular Railgun ###

Neste UC é realizada a simulação e é apresntado ao utilizador dados como a quantidade necessário de segmentos mediante os dados fornecidos no UC anterior; a força (N/m), a acelaração adquirida pelo projétil ao percorrer os trilhos e a sua velocidade final (velocidade ao sair dos trilhos).

###Anexos###

* [Diagrama de Classes](http://imgur.com/fNVcvZ1)   (Incompleto)
* Diagrama de Sequência (Incompleto)

