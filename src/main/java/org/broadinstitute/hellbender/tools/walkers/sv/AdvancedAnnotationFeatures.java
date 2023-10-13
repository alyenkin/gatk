package org.broadinstitute.hellbender.tools.walkers.sv;

/**
 * An enum representing different advanced features to annotate
 */
public enum AdvancedAnnotationFeatures {
    DIST_TO_TSS, // Annotate distance to nearest TSS for intergenic variants
    INTRON_NEAREST_EXONS, // Annotate closest exons and their distances for intronic variants
    EXON_BP_OVERLAP, // Annotate the BP overlap of each exon the variant hits
    NONCODING_SCORE // Annotate the total score (weighted by length) and total length overlap of noncoding features
}
