import { listpickerAjaxReload } from'../widgets/listpicker';

// global exports needed for direct calls from xhtml-Elements
// they are bundled inside an "isywebjs" object, to avoid overly polluting the window-namespace
const isywebjs = {};
isywebjs.listpickerAjaxReload = listpickerAjaxReload;

window.isywebjs = isywebjs;