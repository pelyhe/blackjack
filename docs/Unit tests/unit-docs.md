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
![](2-dealer.png) \

### Deck osztály tesztelése
Ezután jött a Deck osztályhoz készültek el a tesztek, 76%-os lefedettséget eredményezve.
![](3-deck-test.png) \
Függvények lefedettsége:
![](3-deck.png) \

