/*
 **** BEGIN LICENSE BLOCK *****
 * Version: CPL 1.0/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Common Public
 * License Version 1.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.eclipse.org/legal/cpl-v10.html
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 * Copyright (C) 2010 Thomas E Enebo <tom.enebo@gmail.com>
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either of the GNU General Public License Version 2 or later (the "GPL"),
 * or the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the CPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the CPL, the GPL or the LGPL.
 ***** END LICENSE BLOCK *****/
package org.jruby.ast.java_signature;

/**
 *
 * @author enebo
 */
public class ArrayTypeNode extends ReferenceTypeNode {
    protected TypeNode typeForArray;

    public ArrayTypeNode() {
        super(null);
    }

    public ArrayTypeNode(TypeNode typeForArray) {
        this();

        this.typeForArray = typeForArray;
    }

    public void setTypeForArray(TypeNode referenceType) {
        // This may be a chain of [][][] arrays.  We want to set in last in chain.
        if (typeForArray != null && typeForArray instanceof ArrayTypeNode) {
            ((ArrayTypeNode) typeForArray).setTypeForArray(referenceType);
        } else {
            this.typeForArray = referenceType;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof ArrayTypeNode)) return false;

        return typeForArray.equals(((ArrayTypeNode) other).typeForArray);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.typeForArray != null ? this.typeForArray.hashCode() : 0);
        return hash;
    }

    @Override
    public String getWrapperName() {
        return typeForArray.getWrapperName() + "[]";
    }

    @Override
    public String getName() {
        return typeForArray.getName() + "[]";
    }

    @Override
    public String getFullyTypedName() {
        return typeForArray.getFullyTypedName() + "[]";
    }

    @Override
    public boolean isArray() {
        return true;
    }
}