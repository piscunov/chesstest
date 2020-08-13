# chesstest
Chess Test;

Logica dupa care am mers:
Am creat o clasa abstracta pentru a definii caracteristicile unei piese (culoarea si tipul de miscare specifice unei piese).In aceasta clasa se va regasi o metoda de verificare a miscarilor urmata de o validare:
exemplu: AP2 12 22 (va verifica daca exista piesa AP2) si daca este posibila mutarea acesteia in pozitia indicata in matrice adica (1,2) (2,2) );
Exista mai multe tipuri de piese(Rege,Tura, etc.), fiecare cu propiul ei set de miscari unice. Astfel fiecare clasa de piesa custom va mosteni clasa piesa.
Pentru crearea matricii de bord s-a folosit un array 2d de string-uri.


Instructiuni de rulare JAR:
Windows:
Este necesar sa intalam Java pe device;
Deschidem un editor text (Notpade.exe);
In el vom scrie java -jar "Numele Jar-ului". jar;
Salvam fisierul cu extensia ".bat" in directorul unde se afla si fisierul ".jar";
Putem da 2xclick pentru a porni aplicatia; (Pe fisierul ".jar");

Mac OS:
Deschidem Terminal;
"Cd" catre fisierul .jar;
Introducem comanda "java -jar NumeFisier.jar";


