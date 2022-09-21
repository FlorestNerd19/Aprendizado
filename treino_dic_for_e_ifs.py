#Objetivo: criar 3 equipes, cada uma com 3 jogadores e suas pontuações.
#Se a pontuação média da equipe for menor que 100, deve ser escrito "Equipe Desclassificada" 
e1 = {}
e2 = {}
e3 = {}
#três dicionários para cada equipe


for i in range(1,4):
    #para cada equipe, pede pelo nome do jogador e sua pontuação, salvado esses valores no dicionario específico e o imprimindo
    if i == 1:
        print(f'\n Equipe {i}:')
        for j in range(1,4):
            jog= input(f'\n Digite Nome do jogador numero {j}: ')
            pont= int(input(f'\n Digite pontos do jogador numero {j}: '))
            e1[jog] = pont 
        print(e1)

    elif i ==2:
        print('\n\n Equipe 2:')  
        for j in range(1,4):
            jog= input(f'\n Digite Nome do jogador numero {j}: ')
            pont= int(input(f'\n Digite pontos do jogador numero {j}: '))
            e2[jog] = pont       
        print(e2)


    elif i ==3:
        print('\n\n Equipe 3:')
        for j in range(1,4):
            jog= input(f'\n Digite Nome do jogador numero {j}: ')
            pont= int(input(f'\n Digite pontos do jogador numero {j}: '))
            e3[jog] = pont 
        print(e3)


print('\n \n')  
dict(sorted(e1.items(), key=lambda item: item[1]))   #organiza os dicionários pelas pontuações da menor para  a maior       
print('Equipe 1: ',e1)
if sum(e1.values()) >100:
    print(round((sum(e1.values())/3)))
else:
    print('Equipe Desclassificada!')
    #imprime a média da equipe e avisa se a equipe foi desclassificada se obtiver menos de 100 pontos na média.
print('\n \n') 

dict(sorted(e2.items(), key=lambda item: item[1]))
print('Equipe 2: ',e2)
if sum(e2.values()) >100:
    print(round(sum(e2.values())/3))
else:
    print('Equipe Desclassificada!')
print('\n \n')   


dict(sorted(e3.items(), key=lambda item: item[1]))
print('Equipe 3: ',e3)
if sum(e3.values()) >100:
    print(round(sum(e3.values())/3))
else:
    print('Equipe Desclassificada!')