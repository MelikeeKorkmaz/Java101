# Insertion Sort Projesi
## Proje 1

[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

Big-O gösterimini yazınız.

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

- Average case: Aradığımız sayının ortada olması
- Worst case: Aradığımız sayının sonda olması
- Best case: Aradığımız sayının dizinin en başında olması.

[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

---
## Cevaplar

1. [22, 27, 16, 2, 18, 6] -> Insertion Sort Aşamaları
   Insertion Sort her seferinde bir elemanı sıralı alt diziye ekleyerek çalışır.

Adımlar:

İlk eleman (22): Zaten sıralı kabul edilir.

İkinci eleman (27): 22 < 27 → [22, 27, 16, 2, 18, 6]

Üçüncü eleman (16): 27 > 16 → 27 sağa kayar, 22 > 16 → 22 sağa kayar → [16, 22, 27, 2, 18, 6]

Dördüncü eleman (2): 27 > 2 → 27 sağa, 22 > 2 → 22 sağa, 16 > 2 → 16 sağa → [2, 16, 22, 27, 18, 6]

Beşinci eleman (18): 27 > 18 → 27 sağa, 22 > 18 → 22 sağa → [2, 16, 18, 22, 27, 6]

Altıncı eleman (6): 27 > 6 → 27 sağa, 22 > 6 → 22 sağa, 18 > 6 → 18 sağa, 16 > 6 → 16 sağa → [2, 6, 16, 18, 22, 27]

Sonuç: [2, 6, 16, 18, 22, 27]

---
2. Big-O Gösterimi

- Best Case (zaten sıralı dizi): O(n)

- Average Case: O(n²)

- Worst Case (ters sıralı dizi): O(n²)

Bu nedenle: Big-O gösterimi: O(n²)

---
3. 18 sayısı sıralandıktan sonra hangi case'e girer?

Sıralanmış dizi: [2, 6, 16, 18, 22, 27]

18, bu dizide 3. indeks (4. eleman), yani ortada.
Average case

---
4. [7, 3, 5, 8, 2, 9, 4, 15, 6] dizisinin Selection Sort'a göre ilk 4 adımı

Selection Sort, her adımda minimum değeri bulup en baştakiyle yer değiştirir.

- Adım 1:
  Min = 2 → 7 ile yer değiştir:
  [2, 3, 5, 8, 7, 9, 4, 15, 6]

- Adım 2:
  Min (kalanlardan) = 3 → zaten doğru yerde:
  [2, 3, 5, 8, 7, 9, 4, 15, 6]

- Adım 3:
  Min = 4 → 5 ile yer değiştir:
  [2, 3, 4, 8, 7, 9, 5, 15, 6]

- Adım 4:
  Min = 5 → 8 ile yer değiştir:
  [2, 3, 4, 5, 7, 9, 8, 15, 6]