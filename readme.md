O GoF (Gang of Four) é um grupo de autores que publicaram o famoso livro *"Design Patterns: Elements of Reusable Object-Oriented Software"*, no qual eles catalogaram 23 padrões de design orientados a objetos. Esses padrões são organizados em três categorias principais:

### 1. **Padrões Criacionais (Creational Patterns)**
- **Propósito**: Abstrair e/ou adiar o processo de criação de objetos, ajudando a tornar um sistema independente de como seus objetos são criados, compostos e representados.
- **Exemplos**:
    - **Factory Method**: Define uma interface para criar um objeto, mas permite que as subclasses alterem o tipo de objeto que será criado.
    - **Abstract Factory**: Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
    - **Builder**: Separa a construção de um objeto complexo da sua representação, permitindo a criação de diferentes representações do mesmo processo de construção.
    - **Prototype**: Cria novos objetos ao clonar uma instância existente.
    - **Singleton**: Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela.

### 2. **Padrões Estruturais (Structural Patterns)**
- **Propósito**: Facilitar o design de sistemas ao definir formas de compor classes e objetos, criando estruturas maiores e mais complexas.
- **Exemplos**:
    - **Adapter**: Permite que interfaces incompatíveis trabalhem juntas, funcionando como um adaptador entre classes.
    - **Bridge**: Desacopla uma abstração da sua implementação, permitindo que ambas variem independentemente.
    - **Composite**: Compõe objetos em estruturas de árvore para representar hierarquias parte/todo, permitindo que os clientes tratem objetos individuais e composições de objetos de forma uniforme.
    - **Decorator**: Anexa responsabilidades adicionais a um objeto dinamicamente.
    - **Facade**: Fornece uma interface simplificada para um subsistema complexo.
    - **Flyweight**: Usa o compartilhamento para suportar eficientemente grandes quantidades de objetos de granularidade fina.
    - **Proxy**: Fornece um substituto ou marcador para controlar o acesso a outro objeto.

### 3. **Padrões Comportamentais (Behavioral Patterns)**
- **Propósito**: Definir padrões de comunicação entre objetos, promovendo o uso eficaz de algoritmos e a atribuição de responsabilidades entre objetos.
- **Exemplos**:
    - **Chain of Responsibility**: Evita acoplamento entre o remetente de uma solicitação e seu receptor ao dar a mais de um objeto a chance de tratar a solicitação.
    - **Command**: Encapsula uma solicitação como um objeto, permitindo que você parametrize clientes com filas, solicitações ou operações diferidas.
    - **Interpreter**: Define uma gramática para a linguagem e um interpretador que usa a gramática para interpretar sentenças dessa linguagem.
    - **Iterator**: Fornece uma maneira de acessar sequencialmente os elementos de um agregado de objetos sem expor sua representação subjacente.
    - **Mediator**: Define um objeto que encapsula como um conjunto de objetos interage, promovendo o baixo acoplamento.
    - **Memento**: Captura e externaliza o estado interno de um objeto sem violar a encapsulação, permitindo que o estado do objeto seja restaurado posteriormente.
    - **Observer**: Define uma dependência um-para-muitos entre objetos, de forma que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.
    - **State**: Permite que um objeto altere seu comportamento quando seu estado interno muda.
    - **Strategy**: Define uma família de algoritmos, encapsula cada um deles, e os torna intercambiáveis. O Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.
    - **Template Method**: Define o esqueleto de um algoritmo em uma operação, postergando a definição de alguns passos para as subclasses.
    - **Visitor**: Representa uma operação a ser executada nos elementos de uma estrutura de objeto. O Visitor permite que você defina uma nova operação sem mudar as classes dos elementos sobre os quais opera.
