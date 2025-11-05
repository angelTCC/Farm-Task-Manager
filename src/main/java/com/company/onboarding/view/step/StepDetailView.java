package com.company.onboarding.view.step;

import com.company.onboarding.entity.Step;
import com.company.onboarding.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "steps/:id", layout = MainView.class)
@ViewController(id = "Step.detail")
@ViewDescriptor(path = "step-detail-view.xml")
@EditedEntityContainer("stepDc")
@DialogMode(width = "40em", height = "auto", resizable = true) // controlar la anchura del form modal
public class StepDetailView extends StandardDetailView<Step> {
}