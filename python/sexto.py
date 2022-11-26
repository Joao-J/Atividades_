def main():
    pi = 3.1415
    raio = float(input('Informe o raio do circulo em centimetros: '))
    diametro = raio * 2
    area = pi * diametro
    print('De acordo com o raio informado temos um circulo com:\n * raio de: \t\t ' +str(raio)+'cm \n * diametro de: \t ' + str(diametro) + 'cm \n * area de: \t\t ' + str(area) + 'cm')
    print('\n Formulas usadas \n ├── Diametro = Raio² \n └── Area = PI * diametro')
    
main()
