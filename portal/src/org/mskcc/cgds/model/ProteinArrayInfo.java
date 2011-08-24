
package org.mskcc.cgds.model;

/**
 *
 * @author jj
 */
public class ProteinArrayInfo {
    private String id;
    private String type;
    private String source;
    private String gene;
    private String residue;
    private boolean validated;

    public ProteinArrayInfo(String id, String type, String source, String gene, String residue, boolean validated) {
        this.id = id;
        this.type = type;
        this.source = source;
        this.gene = gene;
        this.residue = residue;
        this.validated = validated;
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getResidue() {
        return residue;
    }

    public void setResidue(String residue) {
        this.residue = residue;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }
    
    
}