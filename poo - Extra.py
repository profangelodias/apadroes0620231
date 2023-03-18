class Computador:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo

    def ligar(self):
        print(f'Ligando o {self.marca} modelo {self.modelo}')

#App
computador_1 = Computador('Dell', 'xps')
computador_1.ligar()


class CalcCubo:
    '''Classe que permite calcular o cubo de um número (docstring)'''
    # Comentário 
    def __init__(self, valor):
        self.x = valor
        print('Objeto criado!')

    def calcula_cubo(self):
        self.cubo = self.x * self.x * self.x
        return 'Cubo calculado: ' + str(self.cubo)

#App
num = int(input('Entre com um numero: '))
objCubo = CalcCubo(num)  # instancia a classe
cubo = objCubo.calcula_cubo()
print(cubo)

num2 = int(input('Entre com um numero 2: '))
objCubo2 = CalcCubo(num2)  # instancia a classe
cubo2 = objCubo2.calcula_cubo()
print(cubo2)
