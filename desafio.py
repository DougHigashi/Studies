import random
cont=int(input("Quantos números voce deseja gerar?: "))
cont2=cont
N=[]

op=int(input("1- Apresentar os valores em ordem crescente\n2- Apresentar os valores em ordem decrescente\n3- Ordem aleatória: "))


while op!=1 and op!=2 and op!=3:
    print("Escolha uma das opcoes acima")
    op=int(input(">>"))
if op==1:
     for x in range(cont):
        x = random.randint(1,101)
        N.append(x)
        cont-=1
     while cont2>0:
         print(min(N))
         N.remove(min(N))
         cont2-=1

elif op==2:
    for x in range(cont):
        x = random.randint(1,101)
        N.append(x)
        cont-=1
    while cont2>0:
        
        print(max(N))
        N.remove(max(N))
        cont2-=1
    
elif op==3:
    for x in range(cont):
        x = random.randint(1,101)
        N.append(x)
        cont-=1
    print(sorted(N))
    
              




