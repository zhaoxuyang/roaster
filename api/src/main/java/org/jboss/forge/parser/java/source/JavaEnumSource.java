/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.parser.java.source;

import java.util.List;

import org.jboss.forge.parser.JavaParser;
import org.jboss.forge.parser.java.EnumConstant;
import org.jboss.forge.parser.java.JavaEnum;

/**
 * Represents a Java {@code enum} source file as an in-memory modifiable element. See {@link JavaParser} for various
 * options in generating {@link JavaEnumSource} instances.
 * 
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public interface JavaEnumSource extends JavaEnum<JavaEnumSource>, JavaSource<JavaEnumSource>, InterfaceCapableSource<JavaEnumSource>,
         FieldHolderSource<JavaEnumSource>,
         MethodHolderSource<JavaEnumSource>
{
   /**
    * Return the {@link EnumConstant} with the given name, or return null if no such constant exists.
    * 
    * @param name
    * @return
    */
   @Override
   EnumConstantSource getEnumConstant(String name);

   /**
    * Return all declared {@link EnumConstant} types for this {@link JavaEnum}
    */
   @Override
   List<EnumConstantSource> getEnumConstants();

   /**
    * Add a new {@link EnumConstant}
    */
   EnumConstantSource addEnumConstant();

   /**
    * Add a new {@link EnumConstant} using the given declaration.
    */
   EnumConstantSource addEnumConstant(String declaration);

}