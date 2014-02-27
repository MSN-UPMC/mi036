Systèmes Répartis et Client/Serveur
=====================

Notes de cours - Version 1.0 | Nadarajah Mag-Stellon


----------

Sommaire
---------
[TOC]



Introduction aux systèmes et applications répartis
---------

Un **système d'exploitation** permet la gestion des ressources matériels et propose une interface avec l'utilisateur.

Un **système répartis** est une **collection de ressources interconnectées**.
>   **Avantages** :
>
>   - Accès aux ressources communes ( calcul, stockage, impression...)
>   - Partage d'informations (travail coopératif, algorithme répartis...)

#### Catégories de systèmes réparties

Il y a deux catégories de systèmes réparties :

-   **Homogène** : Multiprocesseurs à mémoire partagée ou répartie.
-   **Mémoire répartie** : Multiordinateurs homogène ou hétérogène.

Multiprocesseur : Ordinateur à parallélisme interne
:   Plusieurs processeurs homogènes et une communication **rapide/fiable/faible latence**.

Système réparti : plusieurs ordinateurs
:   Plusieurs processeurs hétérogènes et communication uniquement par **message/lente/non fiable/latence élevée**.

#### Catégories de systèmes d'exploitation

Il y a trois catégories de systèmes d'exploitation :

-   **Système d'exploitation centralisé + Communication**
-   **Système à architecture répartie (Network operating system)**
-   **Système d'exploitation réparti (Distributed operating system)**


Système d'exploitation centralisé + Communication 
:   Un SE indépendant par machine (Unix,Windows...)

>    **Avantage**: Très simple, machines indépendantes
>    **Désavantage**: Aucune transparence réseau, fonctionnement limité


Système d'exploitation à architectures réparties
:   Un SE presque indépendant par machine (NFS)

>    **Avantage**: Modifications limités d'un SE centralisé existant, Accès aux ressources réparties de manière transparentes
>    **Désavantage**: Incohérence en cas de pannes, Fonctionnement fortement centralisé

Système d'exploitation répartis
:   Un SE réparti (Accent...)

>    **Avantage**: Très simple, Optimisation des performances
>    **Désavantage**: Difficile à réaliser, Incohérence en cas de pannes
    

#### Structures des systèmes d'exploitations

Middelware : Basé sur un SE centralisé communicant ou à architecture répartie

>   **Avantage** : Simple, multi-plateforme, intéropérable, évolutif
>   **Désavantage** : Performance, fonctionnalités limités car lié au système
    

**SEAR** : système pour multiordinateurs hétérogène offrant des services locaux.
**SER** : système pour multiprocesseur ou multiordintauer homogène offrant la vision d'un système à image unique
**Middleware** : couche de service au-dessus d'un SEAR facilitant la réalisation et la mise en oeuvre d'une application répartie.


#### Applications réparties

**Applications réparties** : Ensemble de logiciels pouvant être placée sur **une machine différente**, s'exécuter sur un **système différent** ou être développée dans **un langage différent**.

>   **Avantages** : Fiabilité, disponibilité, performances, gain en maintenance et évolution.
>   **Inconvénients** : Difficulté de réalisation, pas de vision globale, administration lourde

Problèmes des systèmes répartis 

>   **Cohérence, protection et sécurité**
>   Désignation, nommage, communication, synchronisation, gestion de processus, fiabilité, tolérance aux pannes ...

Communication dans les systèmes répartis
---------

Il y a plusieurs formes de communications : passage de message, appel de procédure à distance ...

Définitions du modèle client/serveur :

-   Un processus client fait une demande à un processus serveur
-   Le serveur affectue le service demandé et retourne une réponse au client

>   **Interêts**
>
>   Structuration : Services, client et serveur indépendent.
>   Protection : client et serveur sur des domaines différents
>   Ressources : serveur peut-être partagé entre plusieurs clients


Les appels de procédures sont transparents, permet les contrôle de types, permet la gestion des paramètres et des erreurs.
