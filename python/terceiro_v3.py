def main():
    linha = [int(x) for x in input("Escrevas no minimo dois numeros separados por espaço : \n").split()] 
    num_para_somar = str(linha).replace(',',' +').replace(']','').replace('[','')
    print('A soma entre os números ' + num_para_somar + ' = ' + str(sum(linha)))

main()
