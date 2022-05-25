# JUnit tesztek hasznossága

### Kezdeti állapot
Kezdetben a projekt nem tartalmazott Unit teszteket, a kód lefedettsége 0 volt. Ezt mutatja
az alábbi ábra is:
![](1.png) \
Mint látható, mindenhol 0% a lefedettség, ezen szerettünk volna javítani a tesztek segítségével, melyek
nagy segítséget jelentenek a fejlesztők számára a későbbi fejlesztések során.

### Card osztály tesztelése
Az első tesztelt osztály a Card osztály volt. Az alábbi ábra mutatja, hogy itt a kódlefedettség 
jóval megnőtt, közel 100%.
![](2-card.png) \
Az osztály belseje tesztek szempontjából így néz ki:
![](2-card-test.png) 

### Dealer osztály tesztelése
A következő osztály, melyhez készítve lettek tesztek a Dealer osztály volt. Itt a lefedettség 86%.
![](2-dealer-test.png) \
Belülről:
![](2-dealer.png) 


### Deck osztály tesztelése
Ezután jött a Deck osztályhoz készültek el a tesztek, 76%-os lefedettséget eredményezve.
![](3-deck-test.png) \
Függvények lefedettsége:
![](3-deck.png) 

### Hand osztály tesztelése
Ezt követően a Hand osztályhoz tartalmazó teszteket írtuk meg. Itt 85%-os lefedettséget tudtunk elérni:
![](4-hand-test.png) \
A függvények és azok lefedettsége:
![](4-hand.png) 

### Player osztály tesztelése
Végül az utolsó tesztelt osztály a Player volt. Itt is 80% feletti a code coverage.
![](5-player-test.png) \
A függvények és azok lefedettsége:
![](5-player.png) 

\
**Összességében a kód lefedettsége 0%-ról 42%-ra emelkedett, ezzel elősegítve a további fejlesztéseket.**
**Fontos kiemelni, hogy az exception osztályok tesztelhetetlensége eléggé lehúzza ezt az átlagot.**
**Ezen kívül a BlackjackGame osztály függvényei felhasználói interakciókra alapoznak, így azt unit tesztekkel nem célszerű tesztelni.**
