package org.campagnelab.antlr.tomps.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.adapter.ids.SLanguageId;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private final ConceptPresentation props_AlternativeMapper = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ChildDestination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ConceptMapper = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ConvertToMPS = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ConverterName = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Destination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ExampleConcept = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_IToConverter = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_LabeledElementSource = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_LexerRuleSource = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Mapper = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_NewVisitor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Operator = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ParserRuleSource = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_PropertyDestination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Source = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_TextGenHelper = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ToBooleanDestination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ToFloatDestination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ToIntDestination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ToOperator = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_TrimCharacters = new ConceptPresentationBuilder().create();

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) LanguageRegistry.getInstance().getLanguage(MetaAdapterFactory.getLanguage(SLanguageId.deserialize("932d719c-e931-44d5-990c-e115f79b5942"), "org.campagnelab.antlr.tomps")).getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case 0:
        return props_AlternativeMapper;
      case 1:
        return props_ChildDestination;
      case 2:
        return props_ConceptMapper;
      case 3:
        return props_ConvertToMPS;
      case 4:
        return props_ConverterName;
      case 5:
        return props_Destination;
      case 6:
        return props_ExampleConcept;
      case 7:
        return props_IToConverter;
      case 8:
        return props_LabeledElementSource;
      case 9:
        return props_LexerRuleSource;
      case 10:
        return props_Mapper;
      case 11:
        return props_NewVisitor;
      case 12:
        return props_Operator;
      case 13:
        return props_ParserRuleSource;
      case 14:
        return props_PropertyDestination;
      case 15:
        return props_Source;
      case 16:
        return props_TextGenHelper;
      case 17:
        return props_ToBooleanDestination;
      case 18:
        return props_ToFloatDestination;
      case 19:
        return props_ToIntDestination;
      case 20:
        return props_ToOperator;
      case 21:
        return props_TrimCharacters;
    }
    throw new IllegalStateException();
  }
}
