open module modmainfoo { // does not compile (as required modsplitfoo1, modsplitfoo2 both export same package pkgfoo)
    requires modsplitfoo1;
    requires modsplitfoo2;
}
