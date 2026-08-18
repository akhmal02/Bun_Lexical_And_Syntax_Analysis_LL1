# Bun_Lexical_And_Syntax_Analysis_LL1
LL(1) compiler implementation for lexical and syntax analysis using a custom grammar with semantic print actions.

Grammar Rule
1. Gardenia --> Ooobun {print +} vanilla
2. Gardenia --> vanilla Gardenia {print /}
3. Gardenia --> butter Ooobun
4. Ooobun --> choco Sunshine {print *}
5. Ooobun --> pandan Suria butter {print +}
6. Ooobun --> durian {print /} Masimo choco
7. Sunshine --> vanilla Gardenia {print -}
8. Sunshine --> butter
9. Suria --> choco Sunshine {print -}
10. Suria --> ε
11. Masimo --> pandan {print *} Gardenia
12. Masimo --> ε
13. 
Underlying Grammar
1. Gardenia --> Ooobun vanilla
2. Gardenia --> vanilla Gardenia
3. Gardenia --> butter Ooobun
4. Ooobun --> choco Sunshine
5. Ooobun --> pandan Suria butter
6. Ooobun --> durian Masimo choco
7. Sunshine --> vanilla Gardenia
8. Sunshine --> butter
9. Suria  choco Sunshine
10. Suria  ε
11. Masimo - pandan
