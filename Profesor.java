/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author VICTOR SERRANO
 */
@Entity
@Table(name = "PROFESOR", catalog = "", schema = "ADMINISTRADOR")
@NamedQueries({
    @NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p")
    , @NamedQuery(name = "Profesor.findByCedula", query = "SELECT p FROM Profesor p WHERE p.cedula = :cedula")
    , @NamedQuery(name = "Profesor.findByNombres", query = "SELECT p FROM Profesor p WHERE p.nombres = :nombres")
    , @NamedQuery(name = "Profesor.findByApellidos", query = "SELECT p FROM Profesor p WHERE p.apellidos = :apellidos")
    , @NamedQuery(name = "Profesor.findByCarrera", query = "SELECT p FROM Profesor p WHERE p.carrera = :carrera")
    , @NamedQuery(name = "Profesor.findByTipoProf", query = "SELECT p FROM Profesor p WHERE p.tipoProf = :tipoProf")
    , @NamedQuery(name = "Profesor.findByHorasCl", query = "SELECT p FROM Profesor p WHERE p.horasCl = :horasCl")
    , @NamedQuery(name = "Profesor.findByHorasComp", query = "SELECT p FROM Profesor p WHERE p.horasComp = :horasComp")
    , @NamedQuery(name = "Profesor.findByHoraSem", query = "SELECT p FROM Profesor p WHERE p.horaSem = :horaSem")})
public class Profesor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "CARRERA")
    private String carrera;
    @Column(name = "TIPO_PROF")
    private String tipoProf;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HORAS_CL")
    private Double horasCl;
    @Column(name = "HORAS_COMP")
    private Double horasComp;
    @Column(name = "HORA_SEM")
    private Double horaSem;

    public Profesor() {
    }

    public Profesor(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        String oldCedula = this.cedula;
        this.cedula = cedula;
        changeSupport.firePropertyChange("cedula", oldCedula, cedula);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        String oldNombres = this.nombres;
        this.nombres = nombres;
        changeSupport.firePropertyChange("nombres", oldNombres, nombres);
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        String oldApellidos = this.apellidos;
        this.apellidos = apellidos;
        changeSupport.firePropertyChange("apellidos", oldApellidos, apellidos);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        String oldCarrera = this.carrera;
        this.carrera = carrera;
        changeSupport.firePropertyChange("carrera", oldCarrera, carrera);
    }

    public String getTipoProf() {
        return tipoProf;
    }

    public void setTipoProf(String tipoProf) {
        String oldTipoProf = this.tipoProf;
        this.tipoProf = tipoProf;
        changeSupport.firePropertyChange("tipoProf", oldTipoProf, tipoProf);
    }

    public Double getHorasCl() {
        return horasCl;
    }

    public void setHorasCl(Double horasCl) {
        Double oldHorasCl = this.horasCl;
        this.horasCl = horasCl;
        changeSupport.firePropertyChange("horasCl", oldHorasCl, horasCl);
    }

    public Double getHorasComp() {
        return horasComp;
    }

    public void setHorasComp(Double horasComp) {
        Double oldHorasComp = this.horasComp;
        this.horasComp = horasComp;
        changeSupport.firePropertyChange("horasComp", oldHorasComp, horasComp);
    }

    public Double getHoraSem() {
        return horaSem;
    }

    public void setHoraSem(Double horaSem) {
        Double oldHoraSem = this.horaSem;
        this.horaSem = horaSem;
        changeSupport.firePropertyChange("horaSem", oldHoraSem, horaSem);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "examen.Profesor[ cedula=" + cedula + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
