# R201 DOO : squelette de structure pour projet eclipse Java

Noter :
- le fichier caché <code>.gitignore</code>, qui liste les fichiers que Git NE doit PAS versionner. 
Ne pas modifier ce fichier.
- le fichier caché <code>.classpath</code>
- le dossier <code>src/</code>
- le fichier <code>src/.gitignore</code> (identique au <code>.gitignore</code> à la racine)

# ICI LES RÉPONSES DES EXOS 5 À 10

#### Ex. 5  
**Que signifie “redéfinir une méthode” ?**  
Redéfinir une méthode, c'est écrire une nouvelle version d'une méthode héritée d'une classe parente dans une classe fille. Cette nouvelle version remplace celle de la classe parente lorsqu'elle est appelée sur un objet de la classe fille.  
Cela permet d'adapter le comportement de la méthode aux spécificités de la sous-classe.

#### Ex. 6  
**Quelles méthodes de `Velo` et `VeloElec` sont redéfinies ?**  
- La méthode **`toString()`** est redéfinie dans `Velo` et `VeloElec`.
- La méthode **`getPuissance(double FrequenceCoupsDePedale)`** est redéfinie dans `VeloElec`.

#### Ex. 7  
**Que signifie l’annotation `@Override`, placée parfois avant la définition d’une méthode ?**  
L'annotation `@Override` sert à indiquer que la méthode redéfinit (surcharge) une méthode de la classe parente.  
Elle permet au compilateur de vérifier que :
- Une méthode avec la même signature existe bien dans la classe parente.
- Il n’y a pas d’erreur de nom ou de paramètre lors de la redéfinition.

#### Ex. 8  
**Lorsque l’annotation `@Override` est pertinente dans le code, qu’apporte sa présence ? Peut-on s’en dispenser ?**  
- **Avantages de `@Override`** :
  - Sécurise le code en détectant les erreurs de redéfinition dès la compilation.
  - Améliore la lisibilité du code en indiquant clairement qu'il s'agit d'une redéfinition.
  
- **Peut-on s’en passer ?**  
  Oui, on peut s’en passer, le code fonctionnera, mais c’est déconseillé.  
  Sans `@Override`, si on se trompe sur le nom ou les paramètres, le compilateur ne verra pas forcément qu’on voulait redéfinir une méthode existante. Cela peut créer un bug difficile à repérer.

#### Ex. 9  
**Annoter par `@Override` toutes les méthodes pertinentes, dans les 2 classes.**

- Dans `Velo` :
  - `@Override` sur **`toString()`**

- Dans `VeloElec` :
  - `@Override` sur **`toString()`**
  - `@Override` sur **`getPuissance(double FrequenceCoupsDePedale)`**

#### Ex. 10  
**Que signifie l’appel `super.getPuissance(FrequenceCoupsDePedale)` dans la méthode `VeloElec.getPuissance()` ?**  
Cela signifie qu’on appelle la version de la méthode `getPuissance()` définie dans la classe parente `Velo`.  
`super` sert à faire référence à la classe mère.  
Ici, on utilise le calcul de puissance défini dans `Velo` et on le multiplie par le `facteurPuissanceMoteur` pour adapter le calcul à un vélo électrique.


