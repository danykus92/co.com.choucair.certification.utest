# language: es
#Autor:danykus
    Característica: Registro de usuario
    Un usuario, requiere registrarse en Utest

    @registro
    Esquema del escenario: Registro de usuario
        Dado que Daniel se encuentra en el step 1 de registro
            | strName            | strLastName        | strEmail    | strMonth   | strDay   |   strYear |
            | <strName>          | <strLastName>      | <strEmail>  | <strMonth> | <strDay> | <strYear> |
        Cuando Registre los pasos 2, 3 y 4
            | strCity            | strZyp           | strCountry     | strMobile   | strModel   | strOperatingSystem   | strPassword   | strLanguage   | strConfirmePassword      |
            | <strCity>          | <strZyp>         | <strCountry>   | <strMobile> | <strModel> | <strOperatingSystem> | <strPassword> | <strLanguage> | <strConfirmePassword>    |
        Entonces el puede ver en pantalla la informarcion de registro
            | strVerify     |
            | <strVerify>   |

        Ejemplos:
            | strName            | strLastName        | strEmail                   | strMonth | strDay | strYear | strCity   | strZyp   | strCountry |strLanguage | strMobile | strModel | strOperatingSystem | strPassword          | strConfirmePassword     | strVerify                                                                       |
            | Daniel             | Sanchez            | correoprueba@correo.coms    | June     | 13     | 1999    | Montería  | 100000   | Colombia   |Spanish     | Alcatel   | MD01     | Android 2.0       | Aqwertyuio1234567890 | Aqwertyuio1234567890    | Welcome to the world's largest community of freelance software testers!         |
