def main():
    x = int(input('Informe a unidade em metros a ser convertida em centimetro: '))
    m = ' metro'
    if (x > 1):
        m += 's'
    print( str(x) + m + ' é equivalente a ' + str( (x * 100) ) + ' centimetros')

main()
