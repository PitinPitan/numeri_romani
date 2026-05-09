# Convertitore Numeri Romani
[![Build Status](https://github.com/PitinPitan/numeri_romani/actions/workflows/main.yml/badge.svg)](https://github.com/PitinPitan/numeri_romani/actions)
[![Coverage Status](https://coveralls.io/repos/github/PitinPitan/numeri_romani/badge.svg?branch=main)](https://coveralls.io/github/PitinPitan/numeri_romani?branch=main)

**Sviluppatori:**
* **Mattia Milan** (2137968)
* **Nicola Lugato** (2145605)


---

## Obbiettivo
L'obiettivo di questo software è fornire un sistema per la trasformazione di numeri interi in numeri romani (range **1-1000**), con rappresentazione in **ASCII Art**.

## Componenti progetto
* **Core:** Java 17 (OpenJDK)
* **Build System:** Maven 3.11.0
* **Testing:** JUnit 4.13.2
* **CI/CD:** GitHub Actions
* **Quality Gates:** JaCoCo, Coveralls, Checkstyle

## Architettura e Workflow
Il progetto adotta il modello **Gitflow**, separando nettamente lo sviluppo delle funzionalità (`feature/...`) dalla stabilità del branch `main` attraverso il branch di integrazione `development`.

### Pipeline 
Ad ogni interazione sul repository (Push o Pull Request), GitHub Actions scatena un processo automatizzato che garantisce la qualità del codice:
1.  **Compilation:** Verifica dell'integrità del codice.
2.  **Linting:** Analisi statica con Checkstyle (la build fallisce in caso di errori).
3.  **Unit Testing:** Esecuzione della suite completa JUnit.
4.  **Coverage Analysis:** Report dettagliato tramite JaCoCo.
5.  **Cloud Reporting:** Upload automatico delle statistiche su Coveralls.

---

## Analisi Statica (Quality Gate)
Abbiamo configurato **Checkstyle** per mantenere uno stile in tutto il codice, per evitare che uno sviluppatore potesse imprimere il proprio stile rovinando cosi la leggibilità.

### Moduli Implementati:
| Categoria | Moduli Controllati |
| :--- | :--- |
| **Complessità** | `CyclomaticComplexity`, `BooleanExpressionComplexity` |
| **Dimensioni** | `FileLength` (max 500), `MethodLength` (max 60), `LineLength` (max 120) |
| **Best Practices** | `EmptyCatchBlock`, `AvoidStarImport`, `IllegalImport`, `NeedBraces` |
| **Layout** | `FileTabCharacter`, `RegexpHeader` (Header obbligatorio per gli autori) |

---

## Logica di Business

### Conversione (IntegerToRoman)
Il cuore della logica risiede in un algoritmo **greedy** che utilizza mappe ordinate (vettori paralleli) per trasformare l'intero in simboli. 
* **Range:** Stretta validazione tra 1 e 1000 con sollevamento di `IllegalArgumentException` per input invalidi.
* **Design:** La classe è stata progettata come *Utility Class* con costruttore privato per prevenire istanziazioni inutili, minimizzando la complessità ciclomatica.

### Visualizzazione (RomanPrinter)
Il modulo trasforma la stringa romana in arte.
* **Output:** Generazione di una stringa composta da **6 righe verticali**.
* **Caratteri supportati:** Gestione completa dei glifi per `I, V, X, L, C, D, M`.

---

## Testing & Code Coverage
L'obbiettivo inoltre era quello di testare il codice e mantenere un coverage di almeno 85%, obbiettivo che abbiamo raggiunto ottenendo un **coverage del 100%**.

### Dettaglio Suite di Test:
* **IntegerToRomanTest:** Verifica i simboli base, le combinazioni sottrattive (IV, IX, XL, XC, CD, CM) e i numeri complessi (es. 888). Include test per i valori limite (1, 1000) e la gestione delle eccezioni.
* **RomanPrinterTest:** Assicura che ogni simbolo generi l'output ASCII corretto e che la struttura a 6 righe sia rispettata. Include test di riflessione per verificare la sicurezza dei costruttori.

### Risultati Coverage:
> **Status:** ✅ Superato  
> **Percentuale Totale:** **> 100%**   
> Grazie all'uso combinato di JaCoCo e Coveralls, monitoriamo ogni singola riga di codice per prevenire regressioni.

---