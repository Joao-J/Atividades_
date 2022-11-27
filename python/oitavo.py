def main():
    try:
        ganho = float(input('Quanto você ganha por hora: '))
        horas_trabalhadas = float(input('Número de horas trabalhadas: '))
        ganho_por_horas_trabalhadas = ganho * horas_trabalhadas
        print('O seu salário equivalente a esté mês é ' + str(ganho_por_horas_trabalhadas))
    except ValueError:
        print('teve um erro na entrada de dados')
main()
