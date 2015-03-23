/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.drools.shapes.model.datatypes;

import org.drools.drools_shapes.terms.ConceptDescriptor;

import java.net.URI;

public class CD implements ConceptDescriptor {

    private String code;
    private String displayName;
    private String codeSystem;
    private String codeSystemName;
    private URI uri;

    public CD( URI codeURI, String code, String displayName, String codeSystem, String codeSystemName ) {
        this.code = code;
        this.displayName = displayName;
        this.codeSystem = codeSystem;
        this.codeSystemName = codeSystemName;
        this.uri = codeURI;
    }

    public CD( String codeURI, String code, String displayName, String codeSystem, String codeSystemName ) {
        this( URI.create( codeURI ), code, displayName, codeSystem, codeSystemName );
    }

    public CD( String code, String displayName, URI codeSystemURI, String codeSystem, String codeSystemName ) {
        this( URI.create( codeSystemURI.toString() + code ), code, displayName, codeSystem, codeSystemName );
    }


    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode( String code ) {
        this.code = code;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName( String displayName ) {
        this.displayName = displayName;
    }

    @Override
    public String getCodeSystem() {
        return codeSystem;
    }

    @Override
    public void setCodeSystem( String codeSystem ) {
        this.codeSystem = codeSystem;
    }

    @Override
    public URI getUri() {
        return uri;
    }

    @Override
    public void setUri( URI value ) {

    }

    public String getCodeSystemName() {
        return codeSystemName;
    }

    public void setCodeSystemName( String codeSystemName ) {
        this.codeSystemName = codeSystemName;
    }


    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( !( o instanceof ConceptDescriptor ) ) return false;

        ConceptDescriptor cd = (ConceptDescriptor) o;

        if ( !uri.equals( cd.getUri() ) ) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return getUri().hashCode();
    }
}
