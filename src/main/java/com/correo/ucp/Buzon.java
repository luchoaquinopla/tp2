    package com.correo.ucp;

    import java.util.ArrayList;
    import java.util.List;

    public class Buzon {
        private String correoInterno;
        public List<Correo> bandejaEntrada; 
        public List<Correo> bandejaEnviados; 
        public Buzon(){

        }
        public Buzon(String correoInterno, List<Correo> bandejaEntrada, List<Correo> bandejaEnviados){
            this.correoInterno = correoInterno;
            this.bandejaEntrada = new ArrayList<>();
            this.bandejaEnviados = new ArrayList<>();

        }

    public String getCorreoInterno(){
        return  correoInterno;
    }
    public void setCorreoInterno(String correoInterno){
        this.correoInterno = correoInterno;
    }
    public List<Correo> getBandejaEntrada() {
        return bandejaEntrada;
    }

    public List<Correo> getBandejaEnviados() {
        return bandejaEnviados;
    }


    }
