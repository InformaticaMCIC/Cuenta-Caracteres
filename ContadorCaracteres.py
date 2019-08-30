numeros = ["cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce",
           "trece", "catorce", "quince", "diezciseis", "diecisiete", "dieciocho", "diecinueve", "veinte"]


def palabra():
    global texto
    texto = (input("Ingrese Palabra"))
    print("la Palabra Ingresada es: ", texto)


def contar_carcteres():
    global contar
    contar = 0
    for i in texto:
        if (i.isalpha()):
            contar += 1
    print("La palabra ", texto, ", contiene", numeros[contar], "caracteres")


entrada = ""
while entrada == "":
    entrada = input("Ingrese Clave:")
    if entrada == "mcic":
        palabra()
        contar_carcteres()
        entrada = ""
    elif entrada != "mcic":
        print("Clave Incorrecta")
        entrada = ""

print("")