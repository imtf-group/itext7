package com.itextpdf.layout.renderer;

import com.itextpdf.layout.element.Text;

public class FullTextRenderer extends TextRenderer {

    public FullTextRenderer(Text textElement) {
        super(textElement);
    }

    @Override
    public IRenderer getNextRenderer() {
        return new FullTextRenderer((Text) getModelElement());
    }

    @Override
    public void trimFirst() {}
}
