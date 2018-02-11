package org.omegabyte.gaboom;

import java.util.List;

public class SelectIndividuals<GenomeT> extends Individuals<GenomeT> {
    private final int n;

    public SelectIndividuals(long seed, List<Individual<GenomeT>> individuals, int n) {
        super(seed, individuals);
        this.n = n;
    }

    public SelectIndividuals(Individuals<GenomeT> individuals, int n) {
        super(individuals.getSeed(), individuals.getIndividuals());
        this.n = n;
    }

    public int getN() {
        return n;
    }
}