/*******************************************************************************
 * Copyright (c) 2009, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.uml2.properties.uml.components;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueActionPropertiesEditionPart;
import org.obeonetwork.dsl.uml2.properties.uml.parts.UmlViewsRepository;


/**
 * @author <a href="mailto:cedric.brun@obeo.fr">Cédric Brun</a>
 * @generated
 */
public class OpaqueActionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */
	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for clientDependency ReferencesTable
	 */
	private ReferencesTableSettings clientDependencySettings;
	
	/**
	 * Settings for inStructuredNode EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings inStructuredNodeSettings;
	
	/**
	 * Settings for activity EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings activitySettings;
	
	/**
	 * Settings for outgoing ReferencesTable
	 */
	private ReferencesTableSettings outgoingSettings;
	
	/**
	 * Settings for incoming ReferencesTable
	 */
	private ReferencesTableSettings incomingSettings;
	
	/**
	 * Settings for inPartition ReferencesTable
	 */
	private ReferencesTableSettings inPartitionSettings;
	
	/**
	 * Settings for inInterruptibleRegion ReferencesTable
	 */
	private ReferencesTableSettings inInterruptibleRegionSettings;
	
	/**
	 * Settings for redefinedNode ReferencesTable
	 */
	private ReferencesTableSettings redefinedNodeSettings;
	
	
	/**
	 * Default constructor
	 * @generated
	 */
	public OpaqueActionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject opaqueAction, String editing_mode) {
    super(editingContext, opaqueAction, editing_mode);
    parts = new String[] { BASE_PART };
    repositoryKey = UmlViewsRepository.class;
    partKey = UmlViewsRepository.OpaqueAction.class;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * @generated
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
    setInitializing(true);
    if (editingPart != null && key == partKey) {
      editingPart.setContext(elt, allResource);
      
      final OpaqueAction opaqueAction = (OpaqueAction)elt;
      final OpaqueActionPropertiesEditionPart basePart = (OpaqueActionPropertiesEditionPart)editingPart;
      // init values
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.name))
        basePart.setName(EEFConverterUtil.convertToString(UMLPackage.Literals.STRING, opaqueAction.getName()));
      
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.visibility)) {
        basePart.initVisibility(EEFUtils.choiceOfValues(opaqueAction, UMLPackage.eINSTANCE.getNamedElement_Visibility()), opaqueAction.getVisibility());
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.clientDependency)) {
        clientDependencySettings = new ReferencesTableSettings(opaqueAction, UMLPackage.eINSTANCE.getNamedElement_ClientDependency());
        basePart.initClientDependency(clientDependencySettings);
      }
      basePart.setIsLeaf(opaqueAction.isLeaf());
      
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.inStructuredNode)) {
        // init part
        inStructuredNodeSettings = new EObjectFlatComboSettings(opaqueAction, UMLPackage.eINSTANCE.getActivityNode_InStructuredNode());
        basePart.initInStructuredNode(inStructuredNodeSettings);
        // set the button mode
        basePart.setInStructuredNodeButtonMode(ButtonsModeEnum.BROWSE);
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.activity)) {
        // init part
        activitySettings = new EObjectFlatComboSettings(opaqueAction, UMLPackage.eINSTANCE.getActivityNode_Activity());
        basePart.initActivity(activitySettings);
        // set the button mode
        basePart.setActivityButtonMode(ButtonsModeEnum.BROWSE);
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.outgoing)) {
        outgoingSettings = new ReferencesTableSettings(opaqueAction, UMLPackage.eINSTANCE.getActivityNode_Outgoing());
        basePart.initOutgoing(outgoingSettings);
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.incoming)) {
        incomingSettings = new ReferencesTableSettings(opaqueAction, UMLPackage.eINSTANCE.getActivityNode_Incoming());
        basePart.initIncoming(incomingSettings);
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.inPartition)) {
        inPartitionSettings = new ReferencesTableSettings(opaqueAction, UMLPackage.eINSTANCE.getActivityNode_InPartition());
        basePart.initInPartition(inPartitionSettings);
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.inInterruptibleRegion)) {
        inInterruptibleRegionSettings = new ReferencesTableSettings(opaqueAction, UMLPackage.eINSTANCE.getActivityNode_InInterruptibleRegion());
        basePart.initInInterruptibleRegion(inInterruptibleRegionSettings);
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.redefinedNode)) {
        redefinedNodeSettings = new ReferencesTableSettings(opaqueAction, UMLPackage.eINSTANCE.getActivityNode_RedefinedNode());
        basePart.initRedefinedNode(redefinedNodeSettings);
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.body))
        basePart.setBody(opaqueAction.getBodies());
      
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.language))
        basePart.setLanguage(opaqueAction.getLanguages());
      
      // init filters
      
      
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.clientDependency)) {
        basePart.addFilterToClientDependency(new ViewerFilter() {
        
          /**
           * {@inheritDoc}
           * 
           * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
           */
          public boolean select(Viewer viewer, Object parentElement, Object element) {
            if (element instanceof EObject)
              return (!basePart.isContainedInClientDependencyTable((EObject)element));
            return element instanceof Resource;
          }
        
        });
        basePart.addFilterToClientDependency(new EObjectFilter(UMLPackage.Literals.DEPENDENCY));
      }
      
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.inStructuredNode)) {
        basePart.addFilterToInStructuredNode(new ViewerFilter() {
        
          /**
           * {@inheritDoc}
           * 
           * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
           */
          public boolean select(Viewer viewer, Object parentElement, Object element) {
            return (element instanceof String && element.equals("")) || (element instanceof StructuredActivityNode); //$NON-NLS-1$ 
          }
          
        });
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.activity)) {
        basePart.addFilterToActivity(new ViewerFilter() {
        
          /**
           * {@inheritDoc}
           * 
           * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
           */
          public boolean select(Viewer viewer, Object parentElement, Object element) {
            return (element instanceof String && element.equals("")) || (element instanceof Activity); //$NON-NLS-1$ 
          }
          
        });
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.outgoing)) {
        basePart.addFilterToOutgoing(new ViewerFilter() {
        
          /**
           * {@inheritDoc}
           * 
           * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
           */
          public boolean select(Viewer viewer, Object parentElement, Object element) {
            if (element instanceof EObject)
              return (!basePart.isContainedInOutgoingTable((EObject)element));
            return element instanceof Resource;
          }
        
        });
        basePart.addFilterToOutgoing(new EObjectFilter(UMLPackage.Literals.ACTIVITY_EDGE));
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.incoming)) {
        basePart.addFilterToIncoming(new ViewerFilter() {
        
          /**
           * {@inheritDoc}
           * 
           * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
           */
          public boolean select(Viewer viewer, Object parentElement, Object element) {
            if (element instanceof EObject)
              return (!basePart.isContainedInIncomingTable((EObject)element));
            return element instanceof Resource;
          }
        
        });
        basePart.addFilterToIncoming(new EObjectFilter(UMLPackage.Literals.ACTIVITY_EDGE));
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.inPartition)) {
        basePart.addFilterToInPartition(new ViewerFilter() {
        
          /**
           * {@inheritDoc}
           * 
           * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
           */
          public boolean select(Viewer viewer, Object parentElement, Object element) {
            if (element instanceof EObject)
              return (!basePart.isContainedInInPartitionTable((EObject)element));
            return element instanceof Resource;
          }
        
        });
        basePart.addFilterToInPartition(new EObjectFilter(UMLPackage.Literals.ACTIVITY_PARTITION));
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.inInterruptibleRegion)) {
        basePart.addFilterToInInterruptibleRegion(new ViewerFilter() {
        
          /**
           * {@inheritDoc}
           * 
           * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
           */
          public boolean select(Viewer viewer, Object parentElement, Object element) {
            if (element instanceof EObject)
              return (!basePart.isContainedInInInterruptibleRegionTable((EObject)element));
            return element instanceof Resource;
          }
        
        });
        basePart.addFilterToInInterruptibleRegion(new EObjectFilter(UMLPackage.Literals.INTERRUPTIBLE_ACTIVITY_REGION));
      }
      if (isAccessible(UmlViewsRepository.OpaqueAction.Properties.redefinedNode)) {
        basePart.addFilterToRedefinedNode(new ViewerFilter() {
        
          /**
           * {@inheritDoc}
           * 
           * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
           */
          public boolean select(Viewer viewer, Object parentElement, Object element) {
            if (element instanceof EObject)
              return (!basePart.isContainedInRedefinedNodeTable((EObject)element));
            return element instanceof Resource;
          }
        
        });
        basePart.addFilterToRedefinedNode(new EObjectFilter(UMLPackage.Literals.ACTIVITY_NODE));
      }
      
      
      // init values for referenced views
      
      // init filters for referenced views
      
    }
    setInitializing(false);
  }
















	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.name) {
			return UMLPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.visibility) {
			return UMLPackage.eINSTANCE.getNamedElement_Visibility();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.clientDependency) {
			return UMLPackage.eINSTANCE.getNamedElement_ClientDependency();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.isLeaf) {
			return UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.inStructuredNode) {
			return UMLPackage.eINSTANCE.getActivityNode_InStructuredNode();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.activity) {
			return UMLPackage.eINSTANCE.getActivityNode_Activity();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.outgoing) {
			return UMLPackage.eINSTANCE.getActivityNode_Outgoing();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.incoming) {
			return UMLPackage.eINSTANCE.getActivityNode_Incoming();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.inPartition) {
			return UMLPackage.eINSTANCE.getActivityNode_InPartition();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.inInterruptibleRegion) {
			return UMLPackage.eINSTANCE.getActivityNode_InInterruptibleRegion();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.redefinedNode) {
			return UMLPackage.eINSTANCE.getActivityNode_RedefinedNode();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.body) {
			return UMLPackage.eINSTANCE.getOpaqueAction_Body();
		}
		if (editorKey == UmlViewsRepository.OpaqueAction.Properties.language) {
			return UMLPackage.eINSTANCE.getOpaqueAction_Language();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
    OpaqueAction opaqueAction = (OpaqueAction)semanticObject;
    if (UmlViewsRepository.OpaqueAction.Properties.name == event.getAffectedEditor()) {
      opaqueAction.setName((java.lang.String)EEFConverterUtil.createFromString(UMLPackage.Literals.STRING, (String)event.getNewValue()));
    }
    if (UmlViewsRepository.OpaqueAction.Properties.visibility == event.getAffectedEditor()) {
      opaqueAction.setVisibility((VisibilityKind)event.getNewValue());
    }
    if (UmlViewsRepository.OpaqueAction.Properties.clientDependency == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD) {
        if (event.getNewValue() instanceof Dependency) {
          clientDependencySettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
        clientDependencySettings.removeFromReference((EObject) event.getNewValue());
      } else if (event.getKind() == PropertiesEditionEvent.MOVE) {
        clientDependencySettings.move(event.getNewIndex(), (Dependency) event.getNewValue());
      }
    }
    if (UmlViewsRepository.OpaqueAction.Properties.isLeaf == event.getAffectedEditor()) {
      opaqueAction.setIsLeaf((Boolean)event.getNewValue());
    }
    if (UmlViewsRepository.OpaqueAction.Properties.inStructuredNode == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.SET) {
        inStructuredNodeSettings.setToReference((StructuredActivityNode)event.getNewValue());
      } else if (event.getKind() == PropertiesEditionEvent.ADD) {
        StructuredActivityNode eObject = UMLFactory.eINSTANCE.createStructuredActivityNode();
        EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
        PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
        if (provider != null) {
          PropertiesEditingPolicy policy = provider.getPolicy(context);
          if (policy != null) {
            policy.execute();
          }
        }
        inStructuredNodeSettings.setToReference(eObject);
      }
    }
    if (UmlViewsRepository.OpaqueAction.Properties.activity == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.SET) {
        activitySettings.setToReference((Activity)event.getNewValue());
      } else if (event.getKind() == PropertiesEditionEvent.ADD) {
        Activity eObject = UMLFactory.eINSTANCE.createActivity();
        EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
        PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
        if (provider != null) {
          PropertiesEditingPolicy policy = provider.getPolicy(context);
          if (policy != null) {
            policy.execute();
          }
        }
        activitySettings.setToReference(eObject);
      }
    }
    if (UmlViewsRepository.OpaqueAction.Properties.outgoing == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD) {
        if (event.getNewValue() instanceof ActivityEdge) {
          outgoingSettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
        outgoingSettings.removeFromReference((EObject) event.getNewValue());
      } else if (event.getKind() == PropertiesEditionEvent.MOVE) {
        outgoingSettings.move(event.getNewIndex(), (ActivityEdge) event.getNewValue());
      }
    }
    if (UmlViewsRepository.OpaqueAction.Properties.incoming == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD) {
        if (event.getNewValue() instanceof ActivityEdge) {
          incomingSettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
        incomingSettings.removeFromReference((EObject) event.getNewValue());
      } else if (event.getKind() == PropertiesEditionEvent.MOVE) {
        incomingSettings.move(event.getNewIndex(), (ActivityEdge) event.getNewValue());
      }
    }
    if (UmlViewsRepository.OpaqueAction.Properties.inPartition == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD) {
        if (event.getNewValue() instanceof ActivityPartition) {
          inPartitionSettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
        inPartitionSettings.removeFromReference((EObject) event.getNewValue());
      } else if (event.getKind() == PropertiesEditionEvent.MOVE) {
        inPartitionSettings.move(event.getNewIndex(), (ActivityPartition) event.getNewValue());
      }
    }
    if (UmlViewsRepository.OpaqueAction.Properties.inInterruptibleRegion == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD) {
        if (event.getNewValue() instanceof InterruptibleActivityRegion) {
          inInterruptibleRegionSettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
        inInterruptibleRegionSettings.removeFromReference((EObject) event.getNewValue());
      } else if (event.getKind() == PropertiesEditionEvent.MOVE) {
        inInterruptibleRegionSettings.move(event.getNewIndex(), (InterruptibleActivityRegion) event.getNewValue());
      }
    }
    if (UmlViewsRepository.OpaqueAction.Properties.redefinedNode == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD) {
        if (event.getNewValue() instanceof ActivityNode) {
          redefinedNodeSettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
        redefinedNodeSettings.removeFromReference((EObject) event.getNewValue());
      } else if (event.getKind() == PropertiesEditionEvent.MOVE) {
        redefinedNodeSettings.move(event.getNewIndex(), (ActivityNode) event.getNewValue());
      }
    }
    if (UmlViewsRepository.OpaqueAction.Properties.body == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.SET) {
        opaqueAction.getBodies().clear();
        opaqueAction.getBodies().addAll(((EList) event.getNewValue()));
      }
    }
    if (UmlViewsRepository.OpaqueAction.Properties.language == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.SET) {
        opaqueAction.getLanguages().clear();
        opaqueAction.getLanguages().addAll(((EList) event.getNewValue()));
      }
    }
  }

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			OpaqueActionPropertiesEditionPart basePart = (OpaqueActionPropertiesEditionPart)editingPart;
			if (UMLPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmlViewsRepository.OpaqueAction.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(UMLPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (UMLPackage.eINSTANCE.getNamedElement_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(UmlViewsRepository.OpaqueAction.Properties.visibility))
				basePart.setVisibility((VisibilityKind)msg.getNewValue());
			
			if (UMLPackage.eINSTANCE.getNamedElement_ClientDependency().equals(msg.getFeature())  && isAccessible(UmlViewsRepository.OpaqueAction.Properties.clientDependency))
				basePart.updateClientDependency();
			if (UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmlViewsRepository.OpaqueAction.Properties.isLeaf))
				basePart.setIsLeaf((Boolean)msg.getNewValue());
			
			if (UMLPackage.eINSTANCE.getActivityNode_InStructuredNode().equals(msg.getFeature()) && basePart != null && isAccessible(UmlViewsRepository.OpaqueAction.Properties.inStructuredNode))
				basePart.setInStructuredNode((EObject)msg.getNewValue());
			if (UMLPackage.eINSTANCE.getActivityNode_Activity().equals(msg.getFeature()) && basePart != null && isAccessible(UmlViewsRepository.OpaqueAction.Properties.activity))
				basePart.setActivity((EObject)msg.getNewValue());
			if (UMLPackage.eINSTANCE.getActivityNode_Outgoing().equals(msg.getFeature())  && isAccessible(UmlViewsRepository.OpaqueAction.Properties.outgoing))
				basePart.updateOutgoing();
			if (UMLPackage.eINSTANCE.getActivityNode_Incoming().equals(msg.getFeature())  && isAccessible(UmlViewsRepository.OpaqueAction.Properties.incoming))
				basePart.updateIncoming();
			if (UMLPackage.eINSTANCE.getActivityNode_InPartition().equals(msg.getFeature())  && isAccessible(UmlViewsRepository.OpaqueAction.Properties.inPartition))
				basePart.updateInPartition();
			if (UMLPackage.eINSTANCE.getActivityNode_InInterruptibleRegion().equals(msg.getFeature())  && isAccessible(UmlViewsRepository.OpaqueAction.Properties.inInterruptibleRegion))
				basePart.updateInInterruptibleRegion();
			if (UMLPackage.eINSTANCE.getActivityNode_RedefinedNode().equals(msg.getFeature())  && isAccessible(UmlViewsRepository.OpaqueAction.Properties.redefinedNode))
				basePart.updateRedefinedNode();
			if (UMLPackage.eINSTANCE.getOpaqueAction_Body().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmlViewsRepository.OpaqueAction.Properties.body)) {
				basePart.setBody((EList<?>)msg.getNewValue());
			}
			
			if (UMLPackage.eINSTANCE.getOpaqueAction_Language().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmlViewsRepository.OpaqueAction.Properties.language)) {
				basePart.setLanguage((EList<?>)msg.getNewValue());
			}
			
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			UMLPackage.eINSTANCE.getNamedElement_Name(),
			UMLPackage.eINSTANCE.getNamedElement_Visibility(),
			UMLPackage.eINSTANCE.getNamedElement_ClientDependency(),
			UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf(),
			UMLPackage.eINSTANCE.getActivityNode_InStructuredNode(),
			UMLPackage.eINSTANCE.getActivityNode_Activity(),
			UMLPackage.eINSTANCE.getActivityNode_Outgoing(),
			UMLPackage.eINSTANCE.getActivityNode_Incoming(),
			UMLPackage.eINSTANCE.getActivityNode_InPartition(),
			UMLPackage.eINSTANCE.getActivityNode_InInterruptibleRegion(),
			UMLPackage.eINSTANCE.getActivityNode_RedefinedNode(),
			UMLPackage.eINSTANCE.getOpaqueAction_Body(),
			UMLPackage.eINSTANCE.getOpaqueAction_Language()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * @generated
	 */
	public boolean isRequired(Object key, int kind) {
    return key == UmlViewsRepository.OpaqueAction.Properties.isLeaf;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
    Diagnostic ret = Diagnostic.OK_INSTANCE;
    if (event.getNewValue() != null) {
      try {
        if (UmlViewsRepository.OpaqueAction.Properties.name == event.getAffectedEditor()) {
          Object newValue = event.getNewValue();
          if (newValue instanceof String) {
            newValue = EEFConverterUtil.createFromString(UMLPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
          }
          ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
        }
        if (UmlViewsRepository.OpaqueAction.Properties.visibility == event.getAffectedEditor()) {
          Object newValue = event.getNewValue();
          if (newValue instanceof String) {
            newValue = EEFConverterUtil.createFromString(UMLPackage.eINSTANCE.getNamedElement_Visibility().getEAttributeType(), (String)newValue);
          }
          ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getNamedElement_Visibility().getEAttributeType(), newValue);
        }
        if (UmlViewsRepository.OpaqueAction.Properties.isLeaf == event.getAffectedEditor()) {
          Object newValue = event.getNewValue();
          if (newValue instanceof String) {
            newValue = EEFConverterUtil.createFromString(UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf().getEAttributeType(), (String)newValue);
          }
          ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf().getEAttributeType(), newValue);
        }
        if (UmlViewsRepository.OpaqueAction.Properties.body == event.getAffectedEditor()) {
          BasicDiagnostic chain = new BasicDiagnostic();
          for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
            chain.add(Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getOpaqueAction_Body().getEAttributeType(), iterator.next()));
          }
          ret = chain;
        }
        if (UmlViewsRepository.OpaqueAction.Properties.language == event.getAffectedEditor()) {
          BasicDiagnostic chain = new BasicDiagnostic();
          for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
            chain.add(Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getOpaqueAction_Language().getEAttributeType(), iterator.next()));
          }
          ret = chain;
        }
      } catch (IllegalArgumentException iae) {
        ret = BasicDiagnostic.toDiagnostic(iae);
      } catch (WrappedException we) {
        ret = BasicDiagnostic.toDiagnostic(we);
      }
    }
    return ret;
  }


	

}