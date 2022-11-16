```mermaid
classDiagram

class Superhero {
name: str
love_interest: str
first_appearance: date
protect()
}

class Team {
name: str
arch_enemy: str
assemble()
}

Superhero <|-- Team
```