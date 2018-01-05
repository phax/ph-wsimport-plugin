/**
 * Copyright (C) 2015-2018 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.wsimport.plugin;

import java.util.Iterator;

import org.xml.sax.SAXException;

import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.IsSPIImplementation;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JPackage;
import com.sun.tools.ws.processor.model.Model;
import com.sun.tools.ws.wscompile.ErrorReceiver;
import com.sun.tools.ws.wscompile.Plugin;
import com.sun.tools.ws.wscompile.WsimportOptions;

/**
 * Create {@link CodingStyleguideUnaware} annotations in all bean generated
 * classes as well as in the ObjectFactory classes
 *
 * @author Philip Helger
 */
@IsSPIImplementation
public class PluginCodingStyleguideUnaware extends Plugin
{
  private static final String OPT = "ph-csu";

  @Override
  public String getOptionName ()
  {
    return OPT;
  }

  @Override
  public String getUsage ()
  {
    return "  -" + OPT + "       :  add CodingStyleguideUnaware annotations to all classes";
  }

  @Override
  public boolean run (final Model model, final WsimportOptions wo, final ErrorReceiver er) throws SAXException
  {
    final JCodeModel aCodeModel = wo.getCodeModel ();

    // For all packages
    final Iterator <JPackage> itPackages = aCodeModel.packages ();
    while (itPackages.hasNext ())
    {
      final JPackage aPackage = itPackages.next ();

      // For all classes in the package
      final Iterator <JDefinedClass> itClasses = aPackage.classes ();
      while (itClasses.hasNext ())
      {
        final JDefinedClass aDefinedClass = itClasses.next ();

        // Add annotation
        aDefinedClass.annotate (CodingStyleguideUnaware.class);
      }
    }

    return true;
  }
}
