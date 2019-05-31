'use strict';
import business from '../buisness/buisness.container';


const postEndpoint = (router) => {
router.get('/api/posts', async (request, response, next)
=> {
 try {
           	let result = await
	business(request).getPostManager().query();
           	response.status(200).send(result);
       	} catch (error) {
           	console.error('Error');
       	}
   	});
	};
	export default postEndpoint;
