def main():
    nota = []
    while (len(nota) < 4):
        nota.append(float(input('Informe a nota do ' + str(len(nota) + 1) + 'º bimestre : ' )))
    print('Sua média é ' + str(sum(nota)/len(nota)))
    
main()
