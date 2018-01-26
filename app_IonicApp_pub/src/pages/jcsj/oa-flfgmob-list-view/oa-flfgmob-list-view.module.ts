import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_FLFGMobListView } from './oa-flfgmob-list-view';




@NgModule({
  declarations: [
    OA_FLFGMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_FLFGMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_FLFGMobListViewModule {}