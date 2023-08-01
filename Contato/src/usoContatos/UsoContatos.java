
package usoContatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

abstract class Contato {
    
    protected String nome, apelido, email, aniversario;

    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    
    public String imprimirBasico() {
        String mostrar;
        mostrar = "Nome: " + this.nome + "\n";
        mostrar = mostrar + "Apelido: " + this.apelido + "\n";
        mostrar = mostrar + "Email: " + this.email + "\n";
        mostrar = mostrar + "Aniversário: " + this.aniversario + "\n";
        return mostrar;
    }
    
    public abstract String imprimirContato();   
}

class Amigo extends Contato {
    
    protected int grau;

    public Amigo(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        String mostrar;
        mostrar = super.imprimirBasico();
        if (this.grau == 1) {
           mostrar = mostrar + "Grau: Melhor Amigo"; 
           return mostrar;
        } else if (this.grau == 2) {
           mostrar = mostrar + "Grau: Amigo";
           return mostrar;
        } else {
           mostrar = mostrar + "Grau: Conhecido"; 
           return mostrar;
        }   
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }    
}

class Familia extends Contato {

    protected String parentesco;

    public Familia(String nome, String apelido, String email, String aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }
    
    @Override
    public String imprimirContato() {
        String mostrar;
        mostrar = super.imprimirBasico();
        mostrar = mostrar + "Parentesco: " + this.parentesco;
        return mostrar;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    } 
}
    
class ColegasDeTrabalho extends Contato {

    protected String tipo;

    public ColegasDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }
    
    @Override
    public String imprimirContato() {
        String mostrar;
        mostrar = super.imprimirBasico();
        mostrar = mostrar + "Relacionamento de trabalho: " + this.tipo;
        return mostrar;    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }      
}

public class UsoContatos {
    public static void main(String[] args) {
        
        ArrayList<Contato> listaContatos = new ArrayList();
        
        boolean flag = true;
        while(flag) {
            int qualClasse;
            
            Scanner entradas = new Scanner(System.in);
            String[] opMenu = entradas.nextLine().split("\\s");
            if ("".equals(opMenu[0])) {
                break;
            } 
            int menu = Integer.parseInt(opMenu[0]);
            //if (Integer.parseInt(opMenu[0]) == 1) {
            //    qualClasse = Integer.parseInt(opMenu[1]);}
            
            
            switch (menu) {
                case 1:
                    //int qualClasse = entradas.nextInt();
                    switch (Integer.parseInt(opMenu[1])) {
                        case 1: //Inserir Contato
                            //Amigo(String nome, String apelido, String email, String aniversario, int grau)
                            String[] dadosAmigo = entradas.nextLine().split("\\s");
                            System.out.println(Arrays.toString(dadosAmigo));
                            listaContatos.add(new Amigo(dadosAmigo[0], dadosAmigo[1], dadosAmigo[2], dadosAmigo[3], Integer.parseInt(dadosAmigo[4])));
                            break;
                        case 2:
                            //Familia(String nome, String apelido, String email, String aniversario, String parentesco)
                            String[] dadosFamilia = entradas.nextLine().split("\\s");
                            System.out.println(Arrays.toString(dadosFamilia));
                            listaContatos.add(new Familia(dadosFamilia[0], dadosFamilia[1], dadosFamilia[2], dadosFamilia[3], dadosFamilia[4]));
                            break;
                        case 3:
                            //ColegasDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo)
                            String[] dadosColega = entradas.nextLine().split("\\s");
                            System.out.println(Arrays.toString(dadosColega));
                            listaContatos.add(new ColegasDeTrabalho(dadosColega[0], dadosColega[1], dadosColega[2], dadosColega[3], dadosColega[4]));
                            break;
                    }
                    break;

                case 2: //Imprimir todos os contatos
                    for (Contato contato : listaContatos) {
                        System.out.println(contato.imprimirContato());  
                    }
                    break;
                    

                case 3: //Imprimir somente familiares
                    for (Contato contato : listaContatos) {
                        if (contato instanceof Familia) {
                            System.out.println(contato.imprimirContato());
                        }
                    }
                    break;

                case 4: //Imprimir somente amigos
                    for (Contato contato : listaContatos) {
                        if (contato instanceof Amigo) {
                            System.out.println(contato.imprimirContato());
                        }
                    }
                    break;

                case 5: //Imprimir somente colegas de trabalho
                    for (Contato contato : listaContatos) {
                        if (contato instanceof ColegasDeTrabalho) {
                            System.out.println(contato.imprimirContato());
                        }  
                    }
                    break;

                case 6: //Imprimir os melhores amigos, os irmãos e os colegas de trabalho
                    for (Contato contato : listaContatos) {
                        if (contato instanceof Amigo) {
                            if (((Amigo) contato).getGrau() == 1) {
                                System.out.println(contato.imprimirContato());
                            }
                        }
                        if (contato instanceof Familia) {
                            if (((Familia) contato).getParentesco().equals("irmão")) {
                                System.out.println(contato.imprimirContato());
                            }
                        }
                        if (contato instanceof ColegasDeTrabalho) {
                            if (((ColegasDeTrabalho) contato).getTipo().equals("colega")) {
                                System.out.println(contato.imprimirContato());
                            }
                        }
                    }
                    break;

                case 7:
                    int indice = entradas.nextInt();
                    Contato escolhido = listaContatos.set(indice - 1, listaContatos.get(indice - 1));
                    System.out.println(escolhido.imprimirContato());
                    break;

                case 8:
                    flag = false;
                    break;
            }
        }
    }
}
 