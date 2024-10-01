 class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void exibirInfo(){
        System.out.println("Nome :" + nome +"\n"+ "Idade: " + idade);
    }
}
 class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public void exibirInfo(){
        System.out.println("---- Aluno ----");
        super.exibirInfo();
        System.out.println("Matricula: " + matricula);
    }
}
 class Professor extends Pessoa{
    private double salario;
    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void exibirInfo(){
        System.out.println("---- Professor ----");
        super.exibirInfo();
        System.out.println("Salário: R$ " + salario);
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Irineu",21);
        p.exibirInfo();
        Aluno a = new Aluno("WaldisNey",21,"UC2131243");
        a.exibirInfo();
        Professor pr = new Professor("Claudin",39,2000.00);
        pr.exibirInfo();
    }
}
