import { IBizListViewController } from '../../../ibizsys/ts/app/IBizListViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	mdctrlService,
 } from './oa-pcsqpcsqlc-w-mob-wfmdview.service';

export class OA_PCSQPCSQLC_W_MobWFMDViewBase extends IBizListViewController {

    mdctrl: mdctrlService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/OA_PCSQPCSQLC_W_MobWFMDView.do' }));
  }

  ngOnInit(): void {
    this.mdctrl = new mdctrlService({ 'name': 'mdctrl', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('mdctrl', this.mdctrl);
    super.ngOnInit();
  }

  regUIActions(config){
        let uiaction_0 = {"type":"DEUIACTION","tag":"New"
        };
        super.regUIAction(uiaction_0);
        let uiaction_1 = {"type":"DEUIACTION","tag":"Help"
        };
        super.regUIAction(uiaction_1);
    }


    public getNewDataView(params: any = {}): any {
       let newmode = params.srfnewmode;
       if(!newmode) {
            newmode='';
       }
    }

    public getEditDataView(params: any = {}): any {
       let list = [params.srfeditmode2,params.srfeditmode];
       for(let i=0;i<2;i++){
          let editmode=list[i];
          if(!editmode)
             continue;
          if(editmode=='10'){
              return { openMode:'', className:'OA_PCSQPCSQLC_W10_MobWFEditView3', viewParam:params };
          }
          if(editmode=='10@1'){
              return { openMode:'', className:'OA_PCSQPCSQLC_W10_MobWFEditView3', viewParam:params };
          }
          if(editmode=='20'){
              return { openMode:'', className:'OA_PCSQPCSQLC_W20_MobWFEditView3', viewParam:params };
          }
          if(editmode=='20@1'){
              return { openMode:'', className:'OA_PCSQPCSQLC_W20_MobWFEditView3', viewParam:params };
          }
      }
    }
    



  getEditMode(data){
    let editMode=super.getEditMode(data);
    if(editMode&&editMode!='')
       editMode= editMode+':'+ data.pcsqbz;
    else 
       editMode= data.pcsqbz;
      
     return editMode;
      }

  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}