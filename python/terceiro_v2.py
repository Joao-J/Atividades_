def main():
    linha = []
    num = ""
    for x in list(input("Escrevas no minimo dois numeros separados por espaço : \n") + " "):
        try:
            if (int(x) > -1):
                num += str(x)
        except:
            if (len(num) > 0):
                linha.append(int(num))
                num = ""    
    num_para_somar = str(linha).replace(',',' +').replace(']','').replace('[','')
    
    print('A soma entre os números ' + num_para_somar + ' = ' + str(sum(linha)))

main()
