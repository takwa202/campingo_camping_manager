import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


import { CampsiteComponent } from './campsite/campsite.component';
import { HomeComponent } from './components/home/home.component';
import { EditpostsComponent } from './editposts/editposts.component';
import { CommentsListComponent } from './comments-list/comments-list.component';
import { NewsfeedComponent } from './newsfeed/newsfeed.component';
import { TheuserprofileComponent } from './theuserprofile/theuserprofile.component';
import { MapscomponentComponent } from './mapscomponent/mapscomponent.component';




const routes: Routes = [
 /* {
    path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },*/
  { path: 'newfeed', component:NewsfeedComponent  },
  { path: 'editpost/:id', component:EditpostsComponent  },
  { path: 'seecomments/:id', component:  CommentsListComponent},
  {path:'campsite',component:CampsiteComponent},
  {path:'home',component:HomeComponent},
  { path: 'myprofile', component:TheuserprofileComponent  },
  { path: 'userwish', component:MapscomponentComponent  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
