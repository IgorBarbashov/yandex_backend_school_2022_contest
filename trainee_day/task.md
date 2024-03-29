### A. Исследователи

```
Ограничение времени: 1 секунда
Ограничение памяти: 64Mb
Ввод: стандартный ввод или input.txt
Вывод: стандартный вывод или output.txt
```

Дан список, в которой хранятся исследователи и топонимы (имена мест) где они бывали.

Список имеет следующий формат:
```javascript
[  
    [<explorer1>, <toponym1>, <toponym2>, ...],  
    [<explorer2>, <toponym2>, <toponym3>, ...],  
    [<explorer3>, <toponym4>, <toponym1>, ...],  
    ...  
]
```

Надо развернуть этот список, таким образом, чтобы на первом месте оказался топоним, а на остальных исследователи.

**Формат ввода**
```javascript
[  
    ["Mallory", "Everest", "Mont Blanc", "Pillar Rock"],  
    ["Mawson", "South Pole", "New Hebrides"],  
    ["Hillary", "Everest", "South Pole"]  
]
```

**Формат вывода**
```
[  
    ["Everest", "Hillary", "Mallory"],  
    ["South Pole", "Hillary", "Mawson"],  
    ["Mont Blanc", "Mallory"],  
    ["Pillar Rock", "Mallory"],  
    ["New Hebrides", "Mawson"]  
]
```

### Пример

Ввод
```javascript
[
    ["Mawson", "South Pole", "New Hebrides"],
    ["Mallory", "Everest", "Mont Blanc", "Pillar Rock"],
    ["Hillary", "Everest", "South Pole"]
]
```

**Вывод**
```
[["Everest","Hillary","Mallory"],["Mont Blanc","Mallory"],["New Hebrides","Mawson"],["Pillar Rock","Mallory"],["South Pole","Hillary","Mawson"]]
```

### Примечания
Решение необходимо предоставить в виде CommonJS-модуль:
```javascript
module.exports = function (explorers) {  
  // Your code here.  
};
```

Вердикт `RE` также означает, что отправленное решение неверно.
