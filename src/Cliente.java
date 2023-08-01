/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cana0
 */
public class Cliente extends Persona {
    private String nit;

    public Cliente(String nit,String nombres, String apellidos, String notelefono, String direccion, String fechanacimiento) {
        super(nombres, apellidos, notelefono, direccion, fechanacimiento);
        this.nit=nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    @Override
    protected String[] crear(){
        String datos[]=new String[6];
        datos[0]=getNit();
        datos[1]=getNombres();
        datos[2]=getApellidos();
        datos[3]=getDireccion();
        datos[4]=getNotelefono();
        datos[5]=getFechanacimiento();
        return datos;
    }    
}
