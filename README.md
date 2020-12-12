# ProjetoFinalATAL


Nesse repositório encontram-se notas, análise e roteiro de solução do projeto de Alocação otimizada e justa de professores para disciplinas do IFPB.  Esse projeto foi proposto pela disciplina Análise e técnica de algoritmos,  ministrada pelo professor Ruan Delgado Gomes. 

## Descrição do Projeto 

O projeto consiste na implementação de um software para alocação de professores a disciplinas. Esse software e os algoritmos utilizados podem ser genéricos com relação a cursos e professores, mas deve-se tentar criar casos de teste relevantes no contexto da Coordenação da Área de Informática (COAIN) do IFPB Campina Grande. A COAIN possui atualmente 5 cursos: Engenharia de Computação, Telemática, Técnico Integrado em Informática, Técnico Subsequente em Informática e Técnico Subsequente em Manutenção e Suporte em Informática. Algumas disciplinas são oferecidas em múltiplos grupos (olhar o HIFPB para obter essa informação). A equipe conta atualmente com 35 professores efetivos e 4 substitutos. Mais informações sobre os cursos e equipe de professores podem ser obtidas em coain.vhost.ifpb.edu.br.
O desafio na alocação de professores a disciplinas é conseguir alocar os professores mais capacitados para os assuntos específicos, mas ao mesmo tempo atender a requisitos de equalização de trabalho, bem como requisitos com relação à limitação de carga horária máxima por professores. À princípio, a carga horária (CH) de sala de aula máxima de um professor do IFPB é de 20h. No entanto, devido à necessidade de os professores participarem de outras atividades, como reuniões, trabalhos em comissões, orientações de alunos etc, em geral busca-se alocar no máximo 16h ou 18h por professor. Professores que possuem cargos de gestão (ex: coordenador de curso, coordenador de estágio, coordenador de monitorias etc) possuem CH máxima de 12h. Professores em cargos de direção (ex: diretor de ensino ou diretor geral) usualmente não lecionam disciplinas, pois dedicam 100% do tempo ao trabalho de gestão. No entanto, como esses valores podem variar dependendo do contexto, seria interessante ter flexibilidade para configurá-los na hora de executar o software.
Com relação à justiça na alocação de carga de trabalho aos professores, não pode-se apenas considerar a CH semanal de aulas, uma vez que existem disciplinas com níveis de dificuldade diferentes (exigem mais horas de trabalho de preparação), bem como turmas com muito mais alunos que outras (que exigem mais horas de trabalho de acompanhamento e correções de atividades e provas). Dessa forma, o ideal seria que a métrica para determinar a carga de trabalho de um professor levasse em consideração todos esses fatores e o algoritmo conseguisse equalizar a carga de trabalho com base nessa métrica mais holística.
Como parte do projeto, vocês devem definir as métricas e formalizar a função objetivo e as restrições deste problema de otimização, que tem como objetivo maximizar o nível de aptidão médio dos professores alocados às disciplinas, mas ao mesmo tempo atender às restrições de CH impostas e também tentar garantir o máximo de justiça possível na alocação de carga de trabalho. Além disso, seria interessante que o software fosse o mais parametrizável possível, para que pudesse ser usado em diferentes contextos e também que permita ao usuário avaliar diferentes possibilidades. Finalmente, os algoritmos utilizados devem possuir complexidade computacional adequada para executar rapidamente, mesmo considerando entradas que contenham centenas de professores e até milhares de disciplinas. Como parte do projeto, além da descrição dos algoritmos utilizados, deve-se também demonstrar a complexidade deles. Como sugestão, aconselho documentar todas as ideias exploradas, de modo a fundamentar a escolha dos algoritmos da versão final. Quanto mais informações úteis forem geradas sobre o processo de desenvolvimento da solução, melhor.

## Overview de Requisitos

De acordo com a descrição do projeto podemos destacar alguns pontos que devem estar presentes na lógica do desenvolvimento do algoritmo. 

- Alocar os professores mais capacitados para os assuntos específicos
- Atender a requisitos de equalização de trabalho
- Atender requisitos com relação à limitação de carga horária máxima por professor. 
- Coordenadores e Diretores possuem carga horária diferenciada.
- Na alocação, não devemos considerar apenas a carga horária como fator de justica. 
- Definir as métricas e formalizar a função objetivo

## Algoritmo

Nosso algoritmo de alocação de escolhas consiste no uso das estruturas de dados fila de prioridade para fazer o ranqueamento do professor com base nos parâmetros citados anteriormente de maneira, que cada ranqueamento será realizado com o estado do professor sendo alterado. 


