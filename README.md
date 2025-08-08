# 🎓 Sistema de Gerenciamento de Alunos

Este projeto implementa um sistema simples de cadastro e gerenciamento de alunos, utilizando vetores e desenvolvido em Java.

É possível cadastrar alunos, alterar suas notas, consultar suas informações e exibir todos os alunos cadastrados.

## 📚 Objetivo

Aplicar os conceitos fundamentais de programação orientada a objetos, uso de vetores fixos e estrutura de menus, por meio de uma aplicação prática de gerenciamento de alunos em sala de aula.

## 📁 Estrutura de pacotes
```

🎓 Alunos/
└── 📁 src
    ├── 📁 main
    │   └── Main.java      → Contém o menu e controle da aplicação
    └── 📁 classes
        └── Aluno.java     → Classe que representa um aluno

```
## ⚙️ Funcionalidades

- ✅ **Cadastrar aluno**  
  Permite o cadastro de até 10 alunos, com verificação para evitar ultrapassar o limite do vetor.

- 🔍 **Consultar um aluno**  
  Busca um aluno pelo nome e exibe sua média atual calculada automaticamente.

- 🧾 **Listar todos os alunos**  
  Exibe todas as informações dos alunos cadastrados, incluindo nome, notas e média.

- ✏️ **Alterar nota 1**  
  Permite modificar a primeira nota (`n1`) de um aluno já cadastrado.

- ✏️ **Alterar nota 2**  
  Permite modificar a segunda nota (`n2`) de um aluno já cadastrado.

- ❌ **Validação de vetor cheio**  
  Impede o cadastro de novos alunos quando o vetor atinge sua capacidade máxima.
