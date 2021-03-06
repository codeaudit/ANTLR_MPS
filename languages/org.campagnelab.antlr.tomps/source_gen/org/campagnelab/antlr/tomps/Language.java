package org.campagnelab.antlr.tomps;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.smodel.adapter.ids.SLanguageId;
import java.util.UUID;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.smodel.runtime.ILanguageAspect;
import jetbrains.mps.openapi.actions.descriptor.ActionAspectDescriptor;
import jetbrains.mps.actions.descriptor.BaseActionAspectDescriptor;
import jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor;
import jetbrains.mps.openapi.editor.descriptor.EditorAspectDescriptor;
import org.campagnelab.antlr.tomps.editor.EditorAspectDescriptorImpl;
import jetbrains.mps.intentions.IntentionAspectDescriptor;
import org.campagnelab.antlr.tomps.intentions.IntentionsDescriptor;
import jetbrains.mps.smodel.runtime.StructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptPresentationAspect;
import org.campagnelab.antlr.tomps.structure.ConceptPresentationAspectImpl;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import org.campagnelab.antlr.tomps.typesystem.TypesystemDescriptor;

public class Language extends LanguageRuntime {
  public static String MODULE_REF = "932d719c-e931-44d5-990c-e115f79b5942(org.campagnelab.antlr.tomps)";
  public Language() {
  }
  @Override
  public String getNamespace() {
    return "org.campagnelab.antlr.tomps";
  }

  @Override
  public int getVersion() {
    return 0;
  }

  public SLanguageId getId() {
    return new SLanguageId(UUID.fromString("932d719c-e931-44d5-990c-e115f79b5942"));
  }
  @Override
  protected String[] getExtendedLanguageIDs() {
    return new String[]{"jetbrains.mps.baseLanguage"};
  }
  @Override
  public Collection<TemplateModule> getGenerators() {
    return TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "92e3c42f-bc31-4389-addc-b7c0315889a0(org.campagnelab.antlr.tomps#7645898506791942665)"));
  }
  @Override
  protected <T extends ILanguageAspect> T createAspect(Class<T> aspectClass) {
    if (aspectClass.getName().equals("jetbrains.mps.openapi.actions.descriptor.ActionAspectDescriptor")) {
      if (aspectClass == ActionAspectDescriptor.class) {
        return (T) new BaseActionAspectDescriptor();
      }
    }
    if (aspectClass.getName().equals("jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor")) {
      if (aspectClass == BehaviorAspectDescriptor.class) {
        return (T) new org.campagnelab.antlr.tomps.behavior.BehaviorAspectDescriptor();
      }
    }
    if (aspectClass.getName().equals("jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor")) {
      if (aspectClass == ConstraintsAspectDescriptor.class) {
        return (T) new org.campagnelab.antlr.tomps.constraints.ConstraintsAspectDescriptor();
      }
    }
    if (aspectClass.getName().equals("jetbrains.mps.openapi.editor.descriptor.EditorAspectDescriptor")) {
      if (aspectClass == EditorAspectDescriptor.class) {
        return (T) new EditorAspectDescriptorImpl();
      }
    }
    if (aspectClass.getName().equals("jetbrains.mps.intentions.IntentionAspectDescriptor")) {
      if (aspectClass == IntentionAspectDescriptor.class) {
        return (T) new IntentionsDescriptor();
      }
    }
    if (aspectClass.getName().equals("jetbrains.mps.smodel.runtime.StructureAspectDescriptor")) {
      if (aspectClass == StructureAspectDescriptor.class) {
        return (T) new org.campagnelab.antlr.tomps.structure.StructureAspectDescriptor();
      }
    }
    if (aspectClass.getName().equals("jetbrains.mps.smodel.runtime.ConceptPresentationAspect")) {
      if (aspectClass == ConceptPresentationAspect.class) {
        return (T) new ConceptPresentationAspectImpl();
      }
    }
    if (aspectClass.getName().equals("jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor")) {
      if (aspectClass == IHelginsDescriptor.class) {
        return (T) new TypesystemDescriptor();
      }
    }
    return super.createAspect(aspectClass);
  }
}
