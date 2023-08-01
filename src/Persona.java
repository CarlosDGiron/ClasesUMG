/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cana0
 */
abstract class Persona {
    private String nombres,apellidos,notelefono,direccion,fechanacimiento;
    
    public Persona(String nombres, String apellidos, String notelefono, String direccion, String fechanacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.notelefono = notelefono;
        this.direccion = direccion;
        this.fechanacimiento = fechanacimiento;
    }
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

     public String getNotelefono() {
        return notelefono;
    }

    public void setNotelefono(String notelefono) {
        this.notelefono = notelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    protected String[] crear(){
       return null;
    }
}
