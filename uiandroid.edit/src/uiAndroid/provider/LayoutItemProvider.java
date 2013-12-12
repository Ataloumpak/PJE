/**
 */
package uiAndroid.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uiAndroid.Layout;
import uiAndroid.UiAndroidFactory;
import uiAndroid.UiAndroidPackage;

/**
 * This is the item provider adapter for a {@link uiAndroid.Layout} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addLayout_widthPropertyDescriptor(object);
			addLayout_heightPropertyDescriptor(object);
			addLayout_gravityPropertyDescriptor(object);
			addOrientationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_View_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_View_id_feature", "_UI_View_type"),
				 UiAndroidPackage.Literals.VIEW__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_widthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_View_layout_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_View_layout_width_feature", "_UI_View_type"),
				 UiAndroidPackage.Literals.VIEW__LAYOUT_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_heightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_View_layout_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_View_layout_height_feature", "_UI_View_type"),
				 UiAndroidPackage.Literals.VIEW__LAYOUT_HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout gravity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_gravityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_View_layout_gravity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_View_layout_gravity_feature", "_UI_View_type"),
				 UiAndroidPackage.Literals.VIEW__LAYOUT_GRAVITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Orientation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrientationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_orientation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_orientation_feature", "_UI_Layout_type"),
				 UiAndroidPackage.Literals.LAYOUT__ORIENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UiAndroidPackage.Literals.LAYOUT__VIEWS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Layout.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Layout"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Layout layout = (Layout)object;
		return getString("_UI_Layout_type") + " " + layout.getId();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Layout.class)) {
			case UiAndroidPackage.LAYOUT__ID:
			case UiAndroidPackage.LAYOUT__LAYOUT_WIDTH:
			case UiAndroidPackage.LAYOUT__LAYOUT_HEIGHT:
			case UiAndroidPackage.LAYOUT__LAYOUT_GRAVITY:
			case UiAndroidPackage.LAYOUT__ORIENTATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UiAndroidPackage.LAYOUT__VIEWS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UiAndroidPackage.Literals.LAYOUT__VIEWS,
				 UiAndroidFactory.eINSTANCE.createValueElement()));

		newChildDescriptors.add
			(createChildParameter
				(UiAndroidPackage.Literals.LAYOUT__VIEWS,
				 UiAndroidFactory.eINSTANCE.createTextualElement()));

		newChildDescriptors.add
			(createChildParameter
				(UiAndroidPackage.Literals.LAYOUT__VIEWS,
				 UiAndroidFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(UiAndroidPackage.Literals.LAYOUT__VIEWS,
				 UiAndroidFactory.eINSTANCE.createClickableElement()));

		newChildDescriptors.add
			(createChildParameter
				(UiAndroidPackage.Literals.LAYOUT__VIEWS,
				 UiAndroidFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(UiAndroidPackage.Literals.LAYOUT__VIEWS,
				 UiAndroidFactory.eINSTANCE.createVerticalLayout()));

		newChildDescriptors.add
			(createChildParameter
				(UiAndroidPackage.Literals.LAYOUT__VIEWS,
				 UiAndroidFactory.eINSTANCE.createHorizontalLayout()));

		newChildDescriptors.add
			(createChildParameter
				(UiAndroidPackage.Literals.LAYOUT__VIEWS,
				 UiAndroidFactory.eINSTANCE.createIntegerElement()));

		newChildDescriptors.add
			(createChildParameter
				(UiAndroidPackage.Literals.LAYOUT__VIEWS,
				 UiAndroidFactory.eINSTANCE.createBooleanElement()));

		newChildDescriptors.add
			(createChildParameter
				(UiAndroidPackage.Literals.LAYOUT__VIEWS,
				 UiAndroidFactory.eINSTANCE.createCheckbox()));

		newChildDescriptors.add
			(createChildParameter
				(UiAndroidPackage.Literals.LAYOUT__VIEWS,
				 UiAndroidFactory.eINSTANCE.createTimePicker()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UiandroidEditPlugin.INSTANCE;
	}

}
